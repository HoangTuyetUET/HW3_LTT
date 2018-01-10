package SasManagement;

import java.util.Scanner;

public class EnrolmentManagement {
    private static Subject[] subjects = new Subject[50];
    private static int soMH = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = 1;
        while ((menu == 1) || (menu == 2) || (menu == 3) || (menu == 4)) {
            System.out.println(" Hệ thống đăng ký môn học sinh viên");
            System.out.println("--------------------------");
            System.out.println("1. Nhập thông tin môn học sẽ đăng ký\n" +
                    "2. Nhập thông tin môn học đặc biệt sẽ đăng ký\n" +
                    "3. Xóa môn học\n" +
                    "4. In toàn bộ thông tin và học phí môn học" +
                    "Chọn (1-4, khác sẽ thoát):\n");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    addSubject();
                    break;
                case 2:
                    addSpecialSubject();
                    break;
                case 3:
                    deleteSubject();
                    break;
                case 4:
                    printSubject();
                    break;
                default:
                    System.out.println("Đã thoát");
                    break;
            }
        }
    }

    private static void addSubject() {
        scanner.nextLine();
        subjects[soMH] = new Subject();
        System.out.print("Mã môn học : ");
        String maMH = scanner.nextLine();
        int i = 0;
        while (i < soMH) {
            if (subjects[i].getMaMH().equals(maMH)) break;
            i++;
        }
        if (i >= soMH) {
            subjects[soMH].setMaMH(maMH);
            System.out.print("Tên môn học: ");
            subjects[soMH].setTenMH(scanner.nextLine());
            System.out.print("Số tín chỉ học phần: ");
            subjects[soMH].setSoTCHocPhan(scanner.nextInt());
            System.out.print("Số tín chỉ thực hành: ");
            subjects[soMH].setSoTCThucHanh(scanner.nextInt());
            soMH++;
        } else {
            System.out.println("Đã có mã môn học");
        }
    }

    private static void addSpecialSubject() {
        scanner.nextLine();
        System.out.print("Mã môn học : ");
        String maMH = scanner.nextLine();
        int i = 0;
        while (i < soMH) {
            if (subjects[i].getMaMH().equals(maMH)) break;
            i++;
        }
        if (i >= soMH) {
            System.out.print("Tên chương trình SIE, HEDSPI, ICT: ");
            String tenChuongTrinh = scanner.nextLine();
            subjects[soMH] = new SpecialSubject(tenChuongTrinh);
            subjects[soMH].setMaMH(maMH);
            System.out.print("Tên môn học: ");
            subjects[soMH].setTenMH(scanner.nextLine());
            System.out.print("Số tín chỉ học phần: ");
            subjects[soMH].setSoTCHocPhan(scanner.nextInt());
            System.out.print("Số tín chỉ thực hành: ");
            subjects[soMH].setSoTCThucHanh(scanner.nextInt());
            soMH++;
        } else {
            System.out.println("Đã có mã môn học");
        }

    }

    private static void deleteSubject() {
        scanner.nextLine();
        System.out.print("Nhập mã môn học cần xóa: ");
        String maMH = scanner.nextLine();
        int i = 0;
        while (i < soMH) {
            if (subjects[i].getMaMH().equals(maMH)) break;
            i++;
        }
        if (i < soMH) {
            subjects[i].setMaMH("X");
            System.out.println("Đã xóa môn học " + maMH);
        } else {
            System.out.println("Không có môn học " + maMH);
        }

    }

    private static void printSubject() {
        int sum = 0;
        System.out.println("Môn học thường: ");
        int sumSubject = 0;
        for (int i = 0; i < soMH; i++) {
            if ((subjects[i].getMaMH().equals("X") == false) && (subjects[i] instanceof SpecialSubject == false)) {
                sumSubject += subjects[i].getFree();
                System.out.println(subjects[i].getEnrolmentLine());
            }
        }
        sum += sumSubject;
        System.out.println("-------------");
        System.out.println("Tổng:  " + sumSubject);

        System.out.println("Môn học đặc biệt: ");
        int sumSpecialSubject = 0;
        for (int i = 0; i < soMH; i++) {
            if ((subjects[i].getMaMH().equals("X") == false) && (subjects[i] instanceof SpecialSubject)) {
                sumSpecialSubject += subjects[i].getFree();
                System.out.println(subjects[i].getEnrolmentLine());
            }
        }
        sum += sumSpecialSubject;
        System.out.println("-------------");
        System.out.println("Tổng:  " + sumSpecialSubject);
        System.out.println("**************");
        System.out.println("Tổng:  " + sum);

    }
}
