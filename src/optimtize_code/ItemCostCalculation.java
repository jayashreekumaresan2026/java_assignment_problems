package optimtize_code;

class ItemMenu {
    String name;
    int quantity;
    double price;

    void getItemDetail(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }
    void showItemName(){

        System.out.println(name+"   "+quantity+"   "+price+" ");
    }
}


public class ItemCostCalculation {
    public static void main(String[] args) {
        int i;
        ItemMenu[] itemArray = new ItemMenu[3];
        ItemMenu itemList1 = new ItemMenu();
        itemList1.getItemDetail("   Pen", 2, 3);
        ItemMenu  itemList2= new ItemMenu();
        itemList2.getItemDetail("Pencil", 1, 1);
        ItemMenu itemList3 = new ItemMenu();
        itemList3.getItemDetail("Marker", 2, 50);
        itemArray[0] = itemList1;
        itemArray[1] = itemList2;
        itemArray[2] = itemList3;
        for (i = 0; i < (itemArray.length); i++)
        {
            itemArray[i].showItemName();
        }

    }
}
