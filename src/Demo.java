public class Demo {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};

        System.out.println("INSERTING...");
        for (int v : values) {
            heap.insert(v);
            System.out.println("Inserted " + v + " -> heap = " + heap);
        }

        System.out.println("\nPeek min = " + heap.peek());

        System.out.println("\nEXTRACTING mins...");
        while (true) {
            try {
                int min = heap.extractMin();
                System.out.println("Extracted " + min + " -> heap = " + heap);
            } catch (IllegalStateException e) {
                System.out.println("Heap empty. Done.");
                break;
            }
        }
    }
}
