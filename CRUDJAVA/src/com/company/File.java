////package com.company;
////
////import java.io.FileReader;
////import java.io.FileWriter;
////import java.io.IOException;
////
////public class File {
////    public static void main(String[] args) {
////        try {
////            FileReader reader = new FileReader("src/com/company/Hi.txt");
////            FileWriter writer = new FileWriter("Output_Training_01.txt");
////
////            int line;
////            String str = "";
////            while ((line = reader.read()) != -1) {
////                System.out.print((char) line);
////                str += (char) line;
////            }
////            writer.write(str);
////            reader.close();
////            writer.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////}
//package com.company;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class File {
//
//    public static void main(String[] args) {
//
//        addStudent("Nhật, 123456");
//
////        try {
////            FileReader reader = new FileReader("src/com/company/Hi.txt");
////            int line;
////            StringBuilder str = new StringBuilder();
////
////
////            while ((line = reader.read()) != -1) {
////                str.append((char) line);
////            }
////            reader.close();
////            System.out.println(str.toString());
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//    }
//
//
//
//
//    public static void addStudent(String student) {
//        try {
//            FileReader reader = new FileReader("src/com/company/Hi.txt");
//            StringBuilder str = new StringBuilder();
//            int line;
//
//
//            while ((line = reader.read()) != -1) {
//                str.append((char) line);
//            }
//            reader.close();
//
//
//            str.append(student).append("\n");
//
//            FileWriter writer = new FileWriter("src/com/company/Hi.txt");
//            writer.write(str.toString());
//            writer.close();
//
//            System.out.println("Sinh viên đã thêm: " + student);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }}
//
//
