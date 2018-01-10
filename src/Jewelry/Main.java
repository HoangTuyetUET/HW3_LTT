package Jewelry;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Jewelry[] jewelry = new Jewelry[100];
    private static int amount;

    public static void main(String[] args) {
        int menu = 1;
        jewelry[0] = new Jewelry(2, "hoa", "vàng", 232, 150);
        jewelry[1] = new Jewelry(4, "hoa", "bạc", 250, 150);
        jewelry[2] = new Ring(5, "hoa", "bạc", 250, 120, 10);
        amount = 3;
        while ((menu == 1) || (menu == 2) || (menu == 3)) {
            System.out.println(" Jewelry Managemant System");
            System.out.println("--------------------------");
            System.out.println("1. Append new item\n" +
                    "2. Display the information of item\n" +
                    "3. Sale off\n" +
                    "Your choice (1-3, other to quit):\n");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    addNewItem();
                    break;
                case 2:
                    informationOfItem();
                    break;
                case 3:
                    saleOffItem();
                    break;
                default:
                    System.out.println("Đã thoát");
                    break;
            }
        }
    }

    private static void addNewItem() {
        int type = 0;
        System.out.println("Thêm trang sức mới. Nhập thông tin sau:");
        System.out.println("Nếu là nhẫn nhập 1, dây chuyền nhập 2, khác nhập số khác.");
        type = scanner.nextInt();
        if (type == 1) {
            System.out.println("Nhập kích cỡ nhẫn: ");
            int size = scanner.nextInt();
            jewelry[amount] = new Ring(size);
        } else if (type == 2) {
            System.out.println("Mô tả mặt dây chuyền: ");
            String face = scanner.nextLine();
            jewelry[amount] = new Necklace(face);
        } else {
            jewelry[amount] = new Jewelry();
        }
        System.out.println("Mã sản phẩm: ");
        jewelry[amount].setCode(scanner.nextInt());
        System.out.println("Mô tả: ");
        scanner.nextLine();
        jewelry[amount].setDescribe(scanner.nextLine());
        System.out.println("Chất liệu : ");
        jewelry[amount].setMaterial(scanner.nextLine());
        System.out.println("Giá bán buôn: ");
        jewelry[amount].setWholesale_prices(scanner.nextLong());
        System.out.println("Phần trăm tính giá bán lẻ: ");
        jewelry[amount].setPercent(scanner.nextInt());
        amount++;
    }

    private static void informationOfItem() {
        System.out.println("Xem thông tin sản phẩm.");
        System.out.println("Nhập mã code: ");
        int code = scanner.nextInt();
        int i = 0;
        while (i < amount) {
            if (jewelry[i].getCode() == code) break;
            i++;
        }
        if (i < amount) {
            System.out.println("Mô tả: " + jewelry[i].getDescribe());
            System.out.println("Chất liệu : " + jewelry[i].getMaterial());
            System.out.println("Giá bán buôn: " + jewelry[i].getWholesale_prices());
            System.out.println("Giá bán lẻ: " + jewelry[i].getRetail_price());
            if (jewelry[i] instanceof Ring) {
                Ring ring = (Ring) jewelry[i];
                System.out.println("Kích thước nhẫn: " + ring.getSize());
            } else if (jewelry[i] instanceof Necklace) {
                Necklace necklace = (Necklace) jewelry[i];
                System.out.println("Mặt dây chuyền: " + necklace.getFace());
            }
        } else {
            System.out.println("Không có sản phẩm");
        }
    }

    private static void saleOffItem() {
        System.out.println("Giảm giá sản phẩm.");
        System.out.println("Nhập mã code: ");
        int code = scanner.nextInt();
        int i = 0;
        while (i < amount) {
            if (jewelry[i].getCode() == code) break;
            i++;
        }
        if (i < amount) {
            System.out.println("Nhập phần trăm giảm: ");
            System.out.println("Giá giảm giá: " + jewelry[i].saleOff(scanner.nextInt()));
        } else {
            System.out.println("Không có sản phẩm");
        }
    }

}
