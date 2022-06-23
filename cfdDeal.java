import java.util.Date;

public class cfdDeal extends BaseDeal{
    public final Integer multiplier;
    public final Double openAsk;
    public final Double openBid;

    cfdDeal(Trand trand, Long investment,Date createdAt, String assetRic, String uuid, Integer multiplier, Double openAsk, Double openBid){
        super(trand, investment, createdAt, (trand == Trand.Up)?openAsk:openBid, assetRic, uuid);
        this.multiplier = multiplier;
        this.openAsk = openAsk;
        this.openBid = openBid;
    }

    @Override
    boolean isWon(Double currentRate){
        return false;
    }

    @Override
    Long income(Double currentRate){
        return null;
    }
}
