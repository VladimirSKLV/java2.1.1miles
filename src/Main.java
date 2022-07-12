public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int costIsRight = service.calculate(10000);
        System.out.println(costIsRight);

        System.out.println();
        int costIsInvalid = service.calculate(-10000);
        System.out.println(costIsInvalid);

        System.out.println();
        int costIsOne = service.calculate(1);
        System.out.println(costIsOne);

        System.out.println();
        int costIsTwenty = service.calculate(20);
        System.out.println(costIsTwenty);
    }
}