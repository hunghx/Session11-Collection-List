import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collection<Integer> newCollection  = new ArrayList<>();
        newCollection.add(1);
        newCollection.add(2);
        // thêm mới phần tử
        collection.add(10);
        collection.add(100);
        System.out.println(collection);
        // xóa phan tu
        collection.remove(10);
        boolean check = collection.remove(1000);
        System.out.println(check);

        // thêm 1 danh sách
        collection.addAll(newCollection);
        System.out.println(collection);
        // kiểu tra sự ton tai
        boolean checkExist = collection.contains(100);
        System.out.println(checkExist);
        boolean checkExistCollection = collection.containsAll(newCollection);
        System.out.println(checkExistCollection);
        // kiểm tra danh sách rỗng
        System.out.println(collection.isEmpty()); // sai

        // số lương phần tử trong danh sách
        System.out.println(collection.size());
        // chuyển về mảng
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        // làm việc với từng phâ  trong danh sách - duyệt danh sách
        for (Integer item : collection) {
            System.out.println(item);
        }

        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Collection List
        List<String> names = new ArrayList<>();
        names.add(0,"hung");
        names.add("nam");
        // 0,1
        //        names.add(3,"khánh"); // chú ý phats sinh ngoại
        // lấy ra phần tử tại vị trí index
        System.out.println(names.get(1));
        // lây ra vị trí đầu tiên của phần tử chỉ định tìm thấy
        System.out.println(names.indexOf("hung"));
        System.out.println(names.indexOf("hung1"));
        // xóa theo vị trí
        names.remove(0);
        System.out.println(names);
        // thay đỏi giá trị
        names.set(0,"Khánh");
        System.out.println(names.get(0));
        names.add("son");
        names.add("duc");
        names.add("manh");
        names.add("ngân");
        // khanh,son,duc,manh,ngan
        System.out.println(names.subList(1,3));

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList =new LinkedList<>(); // cấu trức lưu trúc trữ liên kết
        linkedList.addFirst(1);
        linkedList.addLast(100);
        linkedList.offer(999); // push
        linkedList.element(); // trả về phần tử đâu tiên mà ko xoa
        linkedList.remove(); // lấy và xóa ptu dau tiên

        linkedList.peek(); // lấy đầu nhưng ko  sinh ra ngoại lệ nếu empty
        System.out.println(linkedList);

        List<Integer> list = new LinkedList<>(arrayList);
        List<Integer> listArray = new ArrayList<>(linkedList);

        // giói thiệu về Vector : giống hệt arrayList nhưng các thao tác xử lí hỗ trợ đa luôn
        Vector<Integer> vector = new Vector<>();
        // sắp xếp

        List<Integer> arrInt = Arrays.asList(1,3,5,7,9,8,6,4,2);
        Collections.sort(arrInt);
        Comparator<Integer> comparator =(a,b)->a-b;
        arrInt.sort(comparator);
        System.out.println(arrInt);
//        Comparable<>
//        Comparator<>
        Person p1 = new Person(1,"Hùng",19,75.5);
        Person p2 = new Person(2,"Nam",21,75.4);
        Person p3 = new Person(3,"Anh",18,75.6);
        Person p4 = new Person(4,"Dưc",30,70.5);
        List<Person> personList = Arrays.asList(p1,p2,p3,p4);
        // sap xep theo ten a->z
        Collections.sort(personList);
        System.out.println(personList);

        // tạo đối tượng comparator
        Comparator<Person> comparatorPerson = (o1,o2)->o1.getName().compareTo(o2.getName());
//        Collections.sort(personList,comparator);
        personList.sort(comparatorPerson);
        System.out.println(personList);
        personList.sort((o1,o2)->o2.getAge()-o1.getAge());
        System.out.println(personList);

    }
}
