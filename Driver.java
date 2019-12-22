public class Driver {
    public static void main(String... strings) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,null);
        treeMap.put(10,null);
        treeMap.put(25,null);
        treeMap.put(5,null);
        treeMap.put(0,null);
        String depth=" ";
        for(Position<Entry<Integer,String>> e : treeMap.positions()){

           for(int i=0;i< treeMap.depth(e);i++)
               System.out.print(".");
            System.out.println(e.getElement());
        }


        System.out.println("----------------------------");
        for(Entry<Integer,String> e : treeMap.entrySet()){
            System.out.println("keys of nodes "+ e.getKey());
        }

        System.out.println("First entry: "+treeMap.firstEntry());
        System.out.println("Last entry: "+treeMap.lastEntry());
        System.out.println("Lower entry: "+treeMap.lowerEntry(86));
        System.out.println("Ceiling entry: "+treeMap.ceilingEntry(6));
        System.out.println("Floor entry: "+treeMap.floorEntry(5));
        System.out.println("Higher entry: "+treeMap.higherEntry(10));

        treeMap.remove(2);
        for(Entry<Integer,String> e : treeMap.entrySet()){
            System.out.println("keys of nodes "+ e.getKey());
        }

        for (Entry<Integer, String> e : treeMap.subMap(10, 25)) {
            System.out.println("submap from 1 to 25 "+ e.getKey());
        }


        for (Position<Entry<Integer,String>> p : treeMap.positions()) {
            for(int i=0;i< treeMap.depth(p);i++)
                System.out.print(".");
            System.out.println("depth of the node: "+p.getElement()+ treeMap.getAux(p));
        }

        treeMap.put(40,"yeni eklendim");
        treeMap.put(15,"yeni eklendim");treeMap.put(30,"yeni eklendim");treeMap.put(27,"yeni eklendim");treeMap.put(26,"yeni eklendim");
        for (Position<Entry<Integer,String>> p : treeMap.positions()) {
            for(int i=0;i< treeMap.depth(p);i++)
                System.out.print(".");
            System.out.println("height of the node: "+ p.getElement()+" "+ treeMap.getAux(p));

        }

        treeMap.remove(25);
        for (Position<Entry<Integer,String>> p : treeMap.positions()) {
            for(int i=0;i< treeMap.depth(p);i++)
                System.out.print(".");
            System.out.println("height of the node: "+ p.getElement()+" "+ treeMap.getAux(p));

        }
        System.out.println("kth largest "+treeMap.findKthLargest(10));

    }

}