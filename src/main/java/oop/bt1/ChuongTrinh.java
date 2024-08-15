/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r1, r2;
        System.out.println("Tao doi tuong r1..");
        r1 = new Rectangle();
        System.out.println("Tao doi tuong r2..");
        System.out.print("Cho biet dai:");
        double dai = input.nextDouble();
        System.out.print("Cho biet rong:");
        double rong = input.nextDouble();
        r2 = new Rectangle(dai, rong);
        System.out.println("Thong tin ket qua:");
        System.out.println("HCN 1: dai:" + r1.getLength() + "-rong:" + r1.getWidth() + "-dien tich:" + r1.findArea() + "-chu vi:" + r1.findPerimeter());
        System.out.println("HCN 2: dai:" + r2.getLength() + "-rong:" + r2.getWidth() + "-dien tich:" + r2.findArea() + "-chu vi:" + r2.findPerimeter());
    }
}
