package com.methods.deckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private static List<Card> deck;

    public static void deck() {
        deck = new ArrayList();
        for (int i = 0; i < 13; i++) {
            CardValue value = CardValue.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(value, Suit.values()[j]);
                deck.add(card);
            }
        }

        Collections.shuffle(deck);

        deck.stream().forEach(card -> System.out.println(card.getCardValue() + " of " + card.getSuit()));

    }
}
