package com.hfad.dig2.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("GOAL: Build your Deck with Victory, Kingdom, and Treasure cards.  At the end, the player with the most victory points in his deck is the winner!  " +
                "                                                                                          " +
                "*********************************" +
                "   PREPARATION:  Choose the starting player for the first game randomly.  In subsequent games, the starting player is to the left of the previous winner.  " +
                "" +
                "**************************************** " +
                "" +
                " GAME PLAY:  Players take turns in clockwise order.  Each turn, the player does the a, b, and c phases in order: a) Action phase" +
                "b) Buy phase, c) Clean-up phase.  The player may play one action card if he has one.  This is optional, even if the player has an action card," +
                "he need not play it.  Action cards allow players to do extra things during their turns.  As players may be able and choose to play several action cards in a turn, players should play their action cards left to right in their play areas so they" +
                "can easily keep track of what and how many extra things they may do. " +
                " ----------------------------------------------------------------    " +
                "+ X Action(s): player can lay X more Actions in Action phase... " +
                "If a card gives the player more than one additional Action, he should keep track of the number of actions he has remaining by counting htem out loud.  " +
                "+ X Card(s): player must draw X more Cards immediately." +
                "  " +
                "+ X coins: player can spend X more coins this turn." +
                "+ 1 Buy: player may buy 1 more card in Buy phase. " +
                " Discard: player puts cards face-up in his Discard pile. " +
                " ----------------------------------------------------------------  " +
                "Trash: player puts card(s) in the Trash pile.  Gain: the player takes a card and puts it in his Discard pile.  " +
                "Reveal: the player shows card(s) and returns them to where they came from.  Set Aside: the player puts cards aside until the instructions indicate where they go.  " +
                "" +
                "The player can gain one card from the Supply y buying it -- paying the cost shown on the card on the lower left.  " +
                "The playerpays in coins from Treasure cards (the number on the coin) and from previously played Action cards.  " +
                "" +
                "---------------------------------------------------------------- " +
                "The player may use combination of Treasure cards from his hand and coins shown on Action cards played this turn." +
                "" +
                "Any Treasure cards played are placed in his player area from left to right, adding them to any cards previously played this turn.  " +
                "" +
                "All these cards will be discarded at the end of the turn, and should not be discarded prior to the Clean-up phase.  " +
                "" +
                "**************************************** " +
                "" +
                "CLEAN-UP PHASE:   " +
                "The player places all cards in his play area onto his Discard pile.  " +
                "This will include all Action cards and Treasure cards he played during this turn.  " +
                "He also places all cards left in his hand onto his Discard pile.  " +
                "" +
                "Draw 5 cards from his Deck.  If there still aren't enough cards to draw/reveal, he just draws/reveals what he can.  " +
                "The player's turn is over.  Play passes clockwise.  " +
                "*****************************************  " +
                "GAME END:  " +
                "1) Province card pile is empty or 2) any 3 Supply piles are empty.  " +
                "Winner: player with most victory points.       *********************************************  ");
    }



    public LiveData<String> getText() {
        return mText;
    }
}