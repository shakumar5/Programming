class LinearSearch {
    public static void main(String args[]){
        LinearSearch obj = new LinearSearch();
        int x[] = {1, 7, 4, 8, 7};
        int k = 7;
        obj.linearSearch(x, k);
    }

    void linearSearch(int a[], int k){
        for(int i = 0; i < a.length; i++){
            if(a[i] == k){
                System.out.println(" Found... ");
                return;
            }
        }
        System.out.println(" Not Found...");
    }
}