package kr.readvice.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * packageName   : kr.readvice.api.common.dataStructure
 * fileName      : Trunk
 * author        : beautyKim
 * date          : 2022-05-12
 * desc          : Box 를 ArrayList  와 결합시켜서 같은 기능을 하는 새로운 제네릭 객체로 만드는 과정
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-12         2022-05-12        최초 생성
 */
@Component @Data @Lazy
public class Vector<T> {
    private ArrayList<T> list;
    public Vector() {this.list = new ArrayList<>();}

    public void add(T t){ list.add(t);}
    public void set(int i, T t){ list.set(i, t);}
    public void remove(T t){ list.remove(t);}
    public List<T> get(){return list;}
    public T get(int i){return list.get(i);}
    public int size(){return list.size();}
    public void clear(){list.clear();}
}
