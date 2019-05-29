package edu.iis.mto.bdd.trains.cucumber.steps;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class EstimatedTravelTime {

    @Zakładając("^ze chcę podróżować z \"(.*)\" do \"(.*)\"$")
    public void givenTravelFromTo(String departure, String destination) {
        throw new PendingException();
    }

    @I("następny pociąg odjeżda o (.*) na lini  \"(.*)\"$")
    public void givenNextTrain(@Transform(JodaLocalTimeConverter.class) LocalTime nextTrain, String line) {
        throw new PendingException();
    }

    @Gdy("^zapytam o godzine przyjazdu$")
    public void whenIAskForArrivalTime() {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać szacowany czas przejazdu:$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) LocalTime estimatedTime) {
        throw new PendingException();
    }
}
