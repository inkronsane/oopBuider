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

public class ComputerBuilder {

    private CPU cpu = null;
    private Motherboard motherboard = null;
    private ComputerCase computerCase = null;
    private Cooler cooler = null;
    private GPU gpu = null;
    private Headphones headphones = null;
    private Keyboard keyboard = null;
    private Microphone microphone = null;
    private Monitor monitor = null;
    private Mouse mouse = null;
    private PowerSupply powerSupply = null;
    private RAM ram = null;
    private Storage storage = null;
    private Webcam webcam = null;
    private double finalCost = 0.0;

    public ComputerBuilder selectCPU(CPU cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder selectMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ComputerBuilder selectComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
        return this;
    }

    public ComputerBuilder selectCooler(Cooler cooler) {
        this.cooler = cooler;
        return this;
    }

    public ComputerBuilder selectGPU(GPU gpu) {
        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder selectHeadphones(Headphones headphones) {
        this.headphones = headphones;
        return this;
    }

    public ComputerBuilder selectKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public ComputerBuilder selectMicrophone(Microphone microphone) {
        this.microphone = microphone;
        return this;
    }

    public ComputerBuilder selectMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public ComputerBuilder selectMouse(Mouse mouse) {
        this.mouse = mouse;
        return this;
    }

    public ComputerBuilder selectPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public ComputerBuilder selectRAM(RAM ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder selectStorage(Storage storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder selectWebcam(Webcam webcam) {
        this.webcam = webcam;
        return this;
    }

    public Computer build() {
        if (cpu == null || ram == null || motherboard == null || storage == null
            || powerSupply == null || gpu == null) {
            throw new IllegalStateException("Обов'язкові компоненти не вибрані.");
            //тут можна зробити як і нижче, щоб повертало в меню збірки, але для галочки нехай буде
        }
        if (cpu.getSupportedSocket() != motherboard.getSupportedSocket()) {
            System.out.println("Сокети конфліктують, змініть свій вибір!");
            return null;
        } else {
            return new Computer(cpu, computerCase, cooler, gpu, headphones, keyboard, microphone,
                monitor, mouse, motherboard, powerSupply, ram, storage, webcam);
        }
    }

    public boolean hasCPU() {
        return cpu != null;
    }

    public void removeCPU() {
        cpu = null;
    }

    public boolean hasMotherboard() {
        return motherboard != null;
    }

    public void removeMotherboard() {
        motherboard = null;
    }

    public boolean hasComputerCase() {
        return computerCase != null;
    }

    public void removeComputerCase() {
        computerCase = null;
    }

    public boolean hasCooler() {
        return cooler != null;
    }

    public void removeCooler() {
        cooler = null;
    }

    public boolean hasGPU() {
        return gpu != null;
    }

    public void removeGPU() {
        gpu = null;
    }

    public boolean hasHeadphones() {
        return headphones != null;
    }

    public void removeHeadphones() {
        headphones = null;
    }

    public boolean hasKeyboard() {
        return keyboard != null;
    }

    public void removeKeyboard() {
        keyboard = null;
    }

    public boolean hasMicrophone() {
        return microphone != null;
    }

    public void removeMicrophone() {
        microphone = null;
    }

    public boolean hasMonitor() {
        return monitor != null;
    }

    public void removeMonitor() {
        monitor = null;
    }

    public boolean hasMouse() {
        return mouse != null;
    }

    public void removeMouse() {
        mouse = null;
    }

    public boolean hasPowerSupply() {
        return powerSupply != null;
    }

    public void removePowerSupply() {
        powerSupply = null;
    }

    public boolean hasRAM() {
        return ram != null;
    }

    public void removeRAM() {
        ram = null;
    }

    public boolean hasStorage() {
        return storage != null;
    }

    public void removeStorage() {
        storage = null;
    }

    public boolean hasWebcam() {
        return webcam != null;
    }

    public void removeWebcam() {
        webcam = null;
    }

    public double getFinalCost() {
        double cost = 0.0;

        if (cpu != null) {
            cost += cpu.getPrice();
        }
        if (motherboard != null) {
            cost += motherboard.getPrice();
        }
        if (computerCase != null) {
            cost += computerCase.getPrice();
        }
        if (cooler != null) {
            cost += cooler.getPrice();
        }
        if (gpu != null) {
            cost += gpu.getPrice();
        }
        if (headphones != null) {
            cost += headphones.getPrice();
        }
        if (keyboard != null) {
            cost += keyboard.getPrice();
        }
        if (microphone != null) {
            cost += microphone.getPrice();
        }
        if (monitor != null) {
            cost += monitor.getPrice();
        }
        if (mouse != null) {
            cost += mouse.getPrice();
        }
        if (powerSupply != null) {
            cost += powerSupply.getPrice();
        }
        if (ram != null) {
            cost += ram.getPrice();
        }
        if (storage != null) {
            cost += storage.getPrice();
        }
        if (webcam != null) {
            cost += webcam.getPrice();
        }

        finalCost = cost;
        return finalCost;
    }
}
