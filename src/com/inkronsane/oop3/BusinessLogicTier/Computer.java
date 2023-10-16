package com.inkronsane.oop3.BusinessLogicTier;

import com.inkronsane.oop3.DataTier.CoreComponents.CPU;
import com.inkronsane.oop3.DataTier.CoreComponents.GPU;
import com.inkronsane.oop3.DataTier.CoreComponents.Motherboard;
import com.inkronsane.oop3.DataTier.CoreComponents.PowerSupply;
import com.inkronsane.oop3.DataTier.CoreComponents.RAM;
import com.inkronsane.oop3.DataTier.CoreComponents.Storage;
import com.inkronsane.oop3.DataTier.HelperComponents.ComputerCase;
import com.inkronsane.oop3.DataTier.HelperComponents.Cooler;
import com.inkronsane.oop3.DataTier.HelperComponents.Headphones;
import com.inkronsane.oop3.DataTier.HelperComponents.Keyboard;
import com.inkronsane.oop3.DataTier.HelperComponents.Microphone;
import com.inkronsane.oop3.DataTier.HelperComponents.Monitor;
import com.inkronsane.oop3.DataTier.HelperComponents.Mouse;
import com.inkronsane.oop3.DataTier.HelperComponents.Webcam;

public class Computer {

    private final CPU cpu;
    private final ComputerCase computerCase;
    private final Cooler cooler;
    private final GPU gpu;
    private final Headphones headphones;
    private final Keyboard keyboard;
    private final Microphone microphone;
    private final Monitor monitor;
    private final Mouse mouse;
    private final Motherboard motherboard;
    private final PowerSupply powerSupply;
    private final RAM ram;
    private final Storage storage;
    private final Webcam webcam;

    public Computer(CPU cpu, ComputerCase computerCase, Cooler cooler, GPU gpu,
        Headphones headphones, Keyboard keyboard, Microphone microphone,
        Monitor monitor, Mouse mouse, Motherboard motherboard,
        PowerSupply powerSupply, RAM ram, Storage storage, Webcam webcam) {
        this.cpu = cpu;
        this.computerCase = computerCase;
        this.cooler = cooler;
        this.gpu = gpu;
        this.headphones = headphones;
        this.keyboard = keyboard;
        this.microphone = microphone;
        this.monitor = monitor;
        this.mouse = mouse;
        this.motherboard = motherboard;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.storage = storage;
        this.webcam = webcam;
    }

    // Додайте геттери для всіх полів, щоб інші класи могли отримати доступ до компонентів.
    public CPU getCPU() {
        return cpu;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public GPU getGPU() {
        return gpu;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Microphone getMicrophone() {
        return microphone;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public RAM getRAM() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Webcam getWebcam() {
        return webcam;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ваш  ПК складається з: \n");

        if (cpu != null) {
            sb.append("Процессору - ").append(cpu.getName()).append("\n");
        }
        if (motherboard != null) {
            sb.append("Матплати - ").append(motherboard.getName()).append("\n");
        }
        if (gpu != null) {
            sb.append("Відеокарти - ").append(gpu.getName()).append("\n");
        }
        if (ram != null) {
            sb.append("ОЗУ - ").append(ram.getName()).append("\n");
        }
        if (powerSupply != null) {
            sb.append("Блоку живлення - ").append(powerSupply.getName()).append("\n");
        }
        if (storage != null) {
            sb.append("Пам'яті - ").append(storage.getName()).append("\n");
        }

        if (cooler != null) {
            sb.append("Кулеру - ").append(cooler.getName()).append("\n");
        }
        if (computerCase != null) {
            sb.append("Корпусу - ").append(computerCase.getName()).append("\n");
        }
        if (headphones != null) {
            sb.append("Навушників - ").append(headphones.getName()).append("\n");
        }
        if (keyboard != null) {
            sb.append("Клавіатури - ").append(keyboard.getName()).append("\n");
        }
        if (microphone != null) {
            sb.append("Мікрофону - ").append(microphone.getName()).append("\n");
        }
        if (monitor != null) {
            sb.append("Монітору - ").append(monitor.getName()).append("\n");
        }
        if (mouse != null) {
            sb.append("Миши - ").append(mouse.getName()).append("\n");
        }
        if (webcam != null) {
            sb.append("Камери - ").append(webcam.getName());
        }

        return sb.toString();
    }
}
