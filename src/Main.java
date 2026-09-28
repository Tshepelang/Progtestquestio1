//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
String[] city = {"Cape town", "Port Elizabeth", "Pretoria"};
String[] console = {"PS5", "XBOX", "SWITCH"};
int[][] sales = {{1000,2000,3000}, {2000,3000,4000}, {1500,1100,1200}};

    System.out.println("--------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("--------------------------------------------------------");
    System.out.printf("%-5s,%-12s,%-12s,%-12s%n", "", console[0], console[1], console[2]);
    System.out.println("----------------------------------------------------------");
    for (int row= 0 ; row < city.length;row++){
        System.out.printf("%-8s", city[row]);

        for (int col=0; col < console.length; col++) {
            System.out.printf("%-12d",sales[row][col]);
        }
    }
    System.out.println();
    
System.out.println("----------------------------------------------------------------");
System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
System.out.println("-----------------------------------------------------------------");

int total = 0;
for (int row=0; row< city.length; row++){
    for (int col=0; col< console.length; col++){
        total+=sales[row][col];
    }
}
    int row;
    int col;
    System.out.println (city+"total:" +total);

}