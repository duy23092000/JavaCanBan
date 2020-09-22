package test16;

public class Test {
    public static void main(String[] args) {
        var stock1 = new Stock("SSI", "Công ty CP chứng khoán SSI");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Cập nhật giá đóng phiên: " + stock1.getPreviousClosingPrice());
        System.out.println("Cập nhật giá hiện tại: " + stock1.getCurrentPrice());
        System.out.println("---------------------------");
        System.out.println("Tỉ lệ giữa giá đóng phiên và giá hiện tại là: " + stock1.getChangePercent() + "%");
    }
}
