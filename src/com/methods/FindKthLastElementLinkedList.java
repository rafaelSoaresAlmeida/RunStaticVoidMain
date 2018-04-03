package com.methods;

import java.util.LinkedList;

public class FindKthLastElementLinkedList {

    public static LinkedList getKthLastElement(LinkedList head, int k) {
        if (head == null || k < 1) {
            return null;
        }

        LinkedList current = head;
        LinkedList nBehindCurrent = head;

        for (int i = 0; i < k - 1; i++) {
            current = current. next;
            if (current == null) {
                return null;
            }
        }

        while (current.next != null) {
            nBehindCurrent = nBehindCurrent.next;
            current = current.next;
        }

        return nBehindCurrent;
    }

}
