package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        Эки setтин симметриялык айырмасын эсептеген symmetricDifference
//        методун ишке ашырыныз. Метод натыйжаны жаңы set катары кайтарышы керек.
//                Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
//
//        Мисалы: [1, 2, 3} жана {0, 1, 2]
//        Жооп: [0, 3]
//
//        public static Set<Integer> symmetricDifference (Set<Integer> set1,
//                Set<Integer> set2) методу болушу керек
//

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println(integerSet);
        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(0, 1, 2));
        System.out.println(integerSet1);

 Set<Integer> a=integers(integerSet,integerSet1);
        System.out.println(a);
    }

    public static Set<Integer> integers(Set<Integer> integerSet, Set<Integer> integerSet1) {
        Set<Integer>integers=new HashSet<>(integerSet);
        integers.removeAll(integerSet1);
        integerSet1.removeAll(integerSet);
        integers.addAll(integerSet1);
        return integers;
    }



}


