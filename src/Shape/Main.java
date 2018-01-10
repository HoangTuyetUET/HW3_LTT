package Shape;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterRound();
        enterCone();
        enterTruncatedCone();
    }

    private static void enterRound() {
        System.out.println("Nhập bán kính hình tròn: ");
        Round round = new Round();
        round.setRadius(scanner.nextDouble());
        System.out.println(" Đường kính hinh tròn : " + round.calculatedDiameter());
        System.out.println(" Chu vi hinh tròn : " + round.calculatedPerimeter());
        System.out.println(" Diện tích hinh tròn : " + round.calculatedSquare());
    }

    private static void enterCone() {
        System.out.println("Nhập bán kính và chiều cao hình nón : ");
        Cone cone = new Cone();
        cone.setRadius(scanner.nextDouble());
        cone.setHeight(scanner.nextDouble());
        System.out.println(" Thể tích hình nón : " + cone.calculatedVolumetricCone());
        System.out.println(" Diện tích xung quanh hình nón : " + cone.calculatedSquareAround());
        System.out.println(" Diện tích toàn phần hình nón : " + cone.calculatedSquareTotal());
    }

    private static void enterTruncatedCone() {
        System.out.println("Nhập 2 bán kính và chiều cao chóp cụt : ");
        TruncatedCone truncatedCone = new TruncatedCone();
        truncatedCone.setRadiusSmall(scanner.nextDouble());
        truncatedCone.setRadiusBig(scanner.nextDouble());
        truncatedCone.setHeight(scanner.nextDouble());
        System.out.println(" Thể tích hình nón cụt : " + truncatedCone.calculatedVolumetric());
        System.out.println(" Diện tích xung quanh hình nón cụt : " + truncatedCone.calculatedSquareAround());
        System.out.println(" Diện tích toàn phần hình nón cụt : " + truncatedCone.calculatedSquareTotal());
    }

}
