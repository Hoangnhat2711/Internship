
import Model.PhuongTien;
import Service.impl.PhuongTienService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhuongTienService service = new PhuongTienService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Tìm kiếm phương tiện");
            System.out.println("4. Xóa phương tiện");
            System.out.println("0. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (service.themMoiPhuongTien()) {
                        System.out.println("THêm mới thành công");
                    }
                    break;
                case 2:
                    System.out.println("Chọn loại phương tiện:");
                    System.out.println("1. Ô tô");
                    System.out.println("2. Xe máy");
                    System.out.println("3. Xe tải");
                    int displayChoice = scanner.nextInt();
                    scanner.nextLine();
                    List<PhuongTien> phuongTiens = service.hienThiPhuongTien(displayChoice);
                    if (phuongTiens != null) {
                        for (PhuongTien pt : phuongTiens) {
                            System.out.println(pt);
                        }
                    } else {
                        System.out.println("Không có");
                    }
                    break;
                case 3:
                    System.out.print("Nhập biển kiểm soát: ");
                    String bienKiemSoatTimKiem = scanner.nextLine();
                    PhuongTien timKiem = service.timKiemPhuongTien(bienKiemSoatTimKiem);
                    System.out.println(timKiem);
                    break;
                case 4:
                    System.out.print("Nhập biển kiểm soát: ");
                    String bienKiemSoatXoa = scanner.nextLine();
                    boolean xoa = service.xoaPhuongTien(bienKiemSoatXoa);
                    break;
                case 0:
                    System.out.println("Thoát");
                    return;
            }
        }
    }
}

//public class Main {
//    public static void main(String[] args) {
//
//    }
//        IPhuongTienService phuongTienService = new PhuongTienService();
//
//        List<PhuongTien> phuongTiens = phuongTienService.hienThiPhuongTien(1);
//        for(PhuongTien phuongTien: phuongTiens){
//            Oto oto = (Oto) phuongTien;
//            System.out.println(oto.toString());
//        }
//        User user = new User();
//        user.setName("123");
//        user.setAge(1234);
//        if(addUser(user)){
//            System.out.println("them thanh cong");
//        };

//                User user = new User();
//                user.setId(13);
//        user.setName("123");
//        user.setAge(1000);
//        if(updateUser(user)){
//            System.out.println("update thanh cong");
//        };

//        if (deleteUser(14)){
//            System.out.println("delete thanh cong");
//        };

//        getList().forEach(System.out::println);
//        getListById(3).forEach(System.out::println);
//        getListByName("q").forEach(System.out::println);
//
//
//    }
// su dung PrepareStatement
//    private static List<User> getList()  {
//        List<User> users = new ArrayList<>();
//        try{
//            Connection connection = ConnectionDbManager.ConnectionDb();
//            PreparedStatement statement = connection.prepareStatement("select * from user ");
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()){
//                User user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setAge(resultSet.getInt("age"));
//                users.add(user);
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        }
//        catch (SQLException exception){
//            exception.printStackTrace();
//        }
//        return users;
//    }
//
//    private static List<User> getListById(int id)  {
//        List<User> users = new ArrayList<>();
//        try{
//            Connection connection = ConnectionDbManager.ConnectionDb();
//            PreparedStatement statement = connection.prepareStatement("select * from user where id = ?");
//            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()){
//                User user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setAge(resultSet.getInt("age"));
//                users.add(user);
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        }
//        catch (SQLException exception){
//            exception.printStackTrace();
//        }
//        return users;
//    }
//
//    private static List<User> getListByName(String name)  {
//        List<User> users = new ArrayList<>();
//        try{
//            Connection connection = ConnectionDbManager.ConnectionDb();
//            PreparedStatement statement = connection.prepareStatement("select * from user where name like ?");
//            statement.setString(1, "%" + name + "%");
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()){
//                User user = new User();
//                user.setId(resultSet.getInt("id"));
//                user.setName(resultSet.getString("name"));
//                user.setAge(resultSet.getInt("age"));
//                users.add(user);
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        }
//        catch (SQLException exception){
//            exception.printStackTrace();
//        }
//        return users;
//    }
//
//
//    private static boolean addUser(User user){
//        String sql = "insert into user(name, age) values(?,?)";
//        try{
//            Connection connection = ConnectionDbManager.ConnectionDb();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, user.getName());
//            statement.setInt(2, user.getAge());
//            statement.execute();
//            statement.close();
//            connection.close();
//            return true;
//        }
//        catch (SQLException exception){
//            System.out.println(exception.toString());
//            return false;
//        }
//    }
//
//    private static boolean updateUser(User user){
//        String sql = "update user set name = ?, age = ? where id = ?";
//        try{
//            Connection connection = ConnectionDbManager.ConnectionDb();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, user.getName());
//            statement.setInt(2, user.getAge());
//            statement.setInt(3, user.getId());
//            statement.execute();
//            statement.close();
//            connection.close();
//            return true;
//        }
//        catch (SQLException exception){
//            System.out.println(exception.toString());
//            return false;
//        }
//    }
//
//    private static boolean deleteUser(int id){
//        String sql = "delete from user where id = ?";
//        try{
//            Connection connection = ConnectionDbManager.ConnectionDb();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1, id);
//            statement.execute();
//            statement.close();
//            connection.close();
//            return true;
//        }
//        catch (SQLException exception){
//            System.out.println(exception.toString());
//            return false;
//        }
//    }


//}
