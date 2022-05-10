package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

/**
 * packageName   : kr.readvice.api.common.dataStructure
 * fileName      : ItemCRUD
 * author        : beautyKim
 * date          : 2022-05-10
 * desc          : 스프링 컴포넌트 스캔
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-10         2022-05-10        최초 생성
 */
public class ItemCRUD {
    public static void main(String[] args){

    }
    @Data @AllArgsConstructor static class Item{
        private int id;
        private String name;
        private int price;
    }
    interface ItemService{
        void save(Item item);
    }
    @RequiredArgsConstructor
    class ItemServiceImpl implements ItemService{
        @Override
        public void save(Item item) {

        }
    }
}
