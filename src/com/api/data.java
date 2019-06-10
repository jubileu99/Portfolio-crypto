package com.api;

public class data {

    String exchangeId;
    String rank;
    String baseSymbol;
    String baseId;
    String quoteSymbol;
    String priceQuote;
    String priceUsd;
    String volumeUsd24Hr;
    String percentExchangeVolume;
    String tradesCount24Hr;
    long update;

    public data(String exchangeId,
                String rank,
                String baseSymbol,
                String baseId,
                String quoteSymbol,
                String priceQuote,
                String priceUsd,
                String volumeUsd24Hr,
                String percentExchangeVolume,
                String tradesCount24Hr,
                long update){
        this.exchangeId = exchangeId;
        this.rank = rank;
        this.baseSymbol = baseSymbol;
        this.baseId = baseId;
        this.quoteSymbol = quoteSymbol;
        this.priceQuote = priceQuote;
        this.priceUsd = priceUsd;
        this.volumeUsd24Hr = volumeUsd24Hr;
        this.percentExchangeVolume = percentExchangeVolume;
        this.tradesCount24Hr = tradesCount24Hr;
        this.update = update;
    }

    @Override
    public String toString() {
        return "data{" +
                "exchangeId='" + exchangeId + '\'' +
                ", rank='" + rank + '\'' +
                ", baseSymbol='" + baseSymbol + '\'' +
                ", baseId='" + baseId + '\'' +
                ", quoteSymbol='" + quoteSymbol + '\'' +
                ", priceQuote='" + priceQuote + '\'' +
                ", priceUsd='" + priceUsd + '\'' +
                ", volumeUsd24Hr='" + volumeUsd24Hr + '\'' +
                ", percentExchangeVolume='" + percentExchangeVolume + '\'' +
                ", tradesCount24Hr='" + tradesCount24Hr + '\'' +
                ", update=" + update +
                '}';
    }

}
