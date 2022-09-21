package com;

import com.utils.FileUtil;
import com.utils.TokenizerUtil;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TestV {
    @Test
    public void sameTest(){ //相同文本
        String path = "D:\\测试文件\\orig_0.8_add.txt";
        String path2 = "D:\\测试文件\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
    @Test
    public void addTest(){ //原文本和抄袭文本
        String path = "D:\\测试文件\\orig.txt";
        String path2 = "D:\\测试文件\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
    @Test
    public void delTest(){
        String path = "D:\\测试文件\\orig.txt";
        String path2 = "D:\\测试文件\\orig_0.8_del.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
    @Test
    public void disTest(){
        String path = "D:\\测试文件\\orig.txt";
        String path2 = "D:\\测试文件\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
    @Test
    public void dis10Test(){
        String path = "D:\\测试文件\\orig.txt";
        String path2 = "D:\\测试文件\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
    @Test
    public void dis15Test(){
        String path = "D:\\测试文件\\orig.txt";
        String path2 = "D:\\测试文件\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
    @Test
    public void Test(){
        String path = "D:\\测试文件\\orig.txt";
        String path2 = "D:\\测试文件\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }

    @Test
    public void NullpointTest(){
        String path = "D:\\测试文件\\123.txt";
        String path2 = "D:\\测试文件\\000.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }

    @Test
    public void TestDIY(){
        String path = "D:\\测试文件\\01.txt";
        String path2 = "D:\\测试文件\\02.txt";
        Map<String, List<Integer>> stringListMap = TokenizerUtil.CountWord(path);
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord(path2);
        String sRsult = TokenizerUtil.CountCos(stringListMap, stringListMap2);
        FileUtil.writeFile("D:\\测试文件\\answer\\ans.txt",String.valueOf(sRsult));
        System.out.println(sRsult);
    }
}
