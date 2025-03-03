package com.example.ttph52917.TT;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class test {
    sachservice service = new sachservice();
    @Test
    public void testsua(){
        sach s = new sach("S001","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien","Nguyen Thi C",2025,5.5f);

        assertEquals("Thanh nien",s.getTenSach());
        assertEquals("Nguyen Thi C",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua2(){
        sach s = new sach("S002","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien2","Le Van Nam",2025,5.5f);

        assertEquals("Thanh nien2",s.getTenSach());
        assertEquals("Le Van Nam",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua3(){
        sach s = new sach("S003","Thieu nhi","Nguyen Van A",2024,8.5f);
        sachservice service = new sachservice();
        service.SuaTT(s,"Thanh nien3","Nguyen A",2025,5.5f);

        assertEquals("Thanh nien3",s.getTenSach());
        assertEquals("Nguyen A",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua4(){
        sach s = new sach("S004","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien4","Tran Van C",2025,5.5f);

        assertEquals("Thanh nien4",s.getTenSach());
        assertEquals("Tran Van C",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void testsua5(){
        sach s = new sach("S005","Thieu nhi","Nguyen Van A",2024,8.5f);
        service.SuaTT(s,"Thanh nien5","Tran Thi D",2025,5.5f);

        assertEquals("Thanh nien5",s.getTenSach());
        assertEquals("Tran Thi D",s.getTacGia());
        assertEquals(2025,s.getNamXuatBan());
        assertEquals(5.5f,s.getGia());
    }

    @Test
    public void HT(){
        int[] arr ={1,20};
        assertEquals(1,sachservice.hient(arr));
    }
    @Test
    public void HT2(){
        int[] arr ={9,50};
        assertEquals(9,sachservice.hient(arr));
    }
    @Test
    public void HT3(){
        int[] arr ={19,20};
        assertEquals(19,sachservice.hient(arr));
    }
    @Test
    public void HT4(){
        int[] arr ={2,5};
        assertEquals(2,sachservice.hient(arr));
    }
    @Test
    public void HT5(){
        int[] arr ={5,11};
        assertEquals(5,sachservice.hient(arr));
    }
}
