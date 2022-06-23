import java.util.Date;

public class fttDeal extends BaseDeal {
    private final Double paymentRate;

    fttDeal(Trand trand, Long investment, Date createdAt, Double openRate, String assetRic, String uuid, Double paymentRate){
        super(trand, investment, createdAt, openRate, assetRic, uuid);
        this.paymentRate = paymentRate;
    }

    @Override
    boolean isWon(Double currentRate){
        return ((currentRate > openRate && trand == Trand.Up) || (currentRate < openRate && trand == Trand.Down));
    }


    @Override
    Long income(Double currentRate) {
        if ((currentRate > openRate && trand == Trand.Up) || (currentRate < openRate && trand == Trand.Down))
            return (long) Math.floor(paymentRate*investment/100);
        else if (currentRate == openRate) return investment;
        else return 0L;

    }
    }