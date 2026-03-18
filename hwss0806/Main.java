package hwss0806;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();
        while (true) {
            System.out.println("===== MENU SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. In danh sách sản phẩm");
            System.out.println("3. Tìm sản phẩm theo khoảng giá");
            System.out.println("4. Thống kê số sản phẩm đã tạo");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int t = Integer.parseInt(sc.nextLine());
            switch (t) {
                case 1:
                    System.out.print("Nhập số sản phẩm mới: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Product p = new Product();
                        p.input(sc);
                        list.add(p);
                    }
                    break;
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Chưa có sản phẩm nào");
                    }
                    else {
                        System.out.println("Danh sách sản phẩm:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print("Sản phẩm thứ "+ (i+1)+": ");
                            list.get(i).print();
                        }
                    }
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Chưa có sản phẩm nào");
                    }
                    else {
                        System.out.print("Nhập giá thấp nhất: ");
                        double min = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập giá cao nhất: ");
                        double max = Double.parseDouble(sc.nextLine());
                        System.out.println("Kết quả tìm kiếm:");
                        for (Product product : list) {
                            if (product.getPrice() >= min && product.getPrice() <= max) {
                                product.print();
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tổng số sản phẩm đã tạo: " + Product.getCount());
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng yêu cầu có trong menu trên!");
            }
        }
    }
}
