package com.inkronsane.oop3.UserInterfaceTier;

import com.inkronsane.oop3.BusinessLogicTier.Computer;
import com.inkronsane.oop3.BusinessLogicTier.ComputerBuilder;
import com.inkronsane.oop3.DataTier.CoreComponents.CPU;
import com.inkronsane.oop3.DataTier.CoreComponents.GPU;
import com.inkronsane.oop3.DataTier.CoreComponents.Motherboard;
import com.inkronsane.oop3.DataTier.CoreComponents.PowerSupply;
import com.inkronsane.oop3.DataTier.CoreComponents.RAM;
import com.inkronsane.oop3.DataTier.CoreComponents.Storage;
import com.inkronsane.oop3.DataTier.HelperComponents.Cooler;
import com.inkronsane.oop3.DataTier.HelperComponents.Headphones;
import com.inkronsane.oop3.DataTier.HelperComponents.Keyboard;
import com.inkronsane.oop3.DataTier.HelperComponents.Microphone;
import com.inkronsane.oop3.DataTier.HelperComponents.Monitor;
import com.inkronsane.oop3.DataTier.HelperComponents.Mouse;
import com.inkronsane.oop3.DataTier.HelperComponents.Webcam;
import com.inkronsane.oop3.DataTier.price.Price;
import java.lang.reflect.Method;
import java.util.Scanner;

public class UI {

    private static final ComputerBuilder computerBuilder = new ComputerBuilder();

    public static void main(String[] args) {
        createComputer();
    }

    public static void createComputer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ласкаво просимо до меню конструктора комп'ютера!");
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    selectComponent("процесор (CPU):", CPU.values());
                    break;
                case 2:
                    selectComponent("матплату (Motherboard):", Motherboard.values());
                    break;
                case 3:
                    selectComponent("оперативну пам'ять (RAM):", RAM.values());
                    break;
                case 4:
                    selectComponent("накопичувач (Storage):", Storage.values());
                    break;
                case 5:
                    selectComponent("блок живлення (Power Supply):", PowerSupply.values());
                    break;
                case 6:
                    selectComponent("відеокарту (GPU):", GPU.values());
                    break;
                case 7:
                    if (computerBuilder.getFinalCost() > 0) {
                        displayOptionalComponentsMenu(scanner);
                    } else {
                        System.out.println("Спершу обери основні компоненти воїне.");
                    }
                    break;
                case 8:
                    buildComputer();
                    return;
                default:
                    System.out.println("Обери коректний варіант воїне.");
                    break;
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("Обирай воїне:");
        System.out.println("1) Обрати процесор (CPU)");
        System.out.println("2) Обрати матплату (Motherboard)");
        System.out.println("3) Обрати ОЗУ (RAM)");
        System.out.println("4) Обрати накопичувач (Storage)");
        System.out.println("5) Обрати блок живлення (Power Supply)");
        System.out.println("6) Обрати відеокарту (GPU)");
        System.out.println("7) Обрати опціональні компоненти");
        System.out.println("8) Завершити збірку ПК");
        System.out.print("Обирай воїне: ");
    }

    private static void displayOptionalComponentsMenu(Scanner scanner) {
        while (true) {
            System.out.println("Обери опціональні компоненти (або 0, щоб завершити):");
            displayOptionalComponents();

            int optionalChoice = scanner.nextInt();
            if (optionalChoice == 0) {
                return;
            }

            if (optionalChoice >= 1 && optionalChoice <= 7) {
                selectOptionalComponent(optionalChoice);
            }
        }
    }

    private static void displayOptionalComponents() {
        System.out.println("1) Обрати кулер (Cooler)");
        System.out.println("2) Обрати навушники (Headphones)");
        System.out.println("3) Обрати клавіатуру (Keyboard)");
        System.out.println("4) Обрати мікрофон (Microphone)");
        System.out.println("5) Обрати монітор (Monitor)");
        System.out.println("6) Обрати миша (Mouse)");
        System.out.println("7) Обрати камеру (Webcam)");
        System.out.println("0. Завершити додавання опціональних компонентів");
        System.out.print("Обирай воїне: ");
    }

    private static void buildComputer() {
        Computer computer = computerBuilder.build();
        if (computer != null) {
            System.out.println("Вітаємо, ви зібрали ваш ПК!");
            System.out.println(computer);
            System.out.println("Вартість вашого ПК: " + computerBuilder.getFinalCost());
            System.out.println("Не грайте в Доту діти!");
        } else {
            createComputer();
        }
    }

    private static void selectComponent(String componentName, Price[] components) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть " + componentName);
        for (int i = 0; i < components.length; i++) {
            System.out.println((i + 1) + ". " + components[i].getAllCharacteristics());
        }
        System.out.println("Натисніть 0 для повернення в меню.");
        int componentChoice = scanner.nextInt();

        if (componentChoice != 0 && componentChoice <= components.length) {
            Price selectedComponent = components[componentChoice - 1];

            if (!isComponentSelected(selectedComponent)) {
                addComponentToBuilder(selectedComponent);
            }
        }

        System.out.println("Вартість ПК: " + computerBuilder.getFinalCost());
    }

    private static boolean isComponentSelected(Price component) {
        String componentType = component.getClass().getSimpleName();
        boolean hasComponent = false;

        try {
            Method hasComponentMethod = computerBuilder.getClass().getMethod("has" + componentType);
            hasComponent = (boolean) hasComponentMethod.invoke(computerBuilder);

            if (hasComponent) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ви вже вибрали компонент цього типу.");
                System.out.print("Бажаєте замінити його (так/ні)? ");
                String replaceChoice = scanner.next();

                if (replaceChoice.equalsIgnoreCase("так")) {
                    Method removeComponentMethod = computerBuilder.getClass()
                        .getMethod("remove" + componentType);
                    removeComponentMethod.invoke(computerBuilder);
                    addComponentToBuilder(component);
                } else {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    private static void addComponentToBuilder(Price component) {
        if (component == null) {
            return;
        }

        try {
            String componentType = component.getClass().getSimpleName();
            Method selectComponentMethod = computerBuilder.getClass()
                .getMethod("select" + componentType, component.getClass());
            selectComponentMethod.invoke(computerBuilder, component);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void selectOptionalComponent(int optionalChoice) {
        switch (optionalChoice) {
            case 1:
                selectComponent("кулер (Cooler):", Cooler.values());
                break;
            case 2:
                selectComponent("навушники (Headphones):", Headphones.values());
                break;
            case 3:
                selectComponent("клавіатура (Keyboard):", Keyboard.values());
                break;
            case 4:
                selectComponent("мікрофон (Microphone):", Microphone.values());
                break;
            case 5:
                selectComponent("монітор (Monitor):", Monitor.values());
                break;
            case 6:
                selectComponent("миша (Mouse):", Mouse.values());
                break;
            case 7:
                selectComponent("камера (Webcam):", Webcam.values());
                break;
            default:
                System.out.println("Обирай коректно воїне.");
                break;
        }
    }
}
