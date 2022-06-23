import java.util.Date;

public abstract class BaseDeal {
    Trand trand;
    Long investment;
    Date createdAt;
    Date closedAt;
    Double openRate;
    Double closedRate;
    String assetRic;
    String uuid;

    BaseDeal(Trand trand, Long investment, Date createdAt, Double openRate, String assetRic, String uuid){
        this.trand = trand;
        this.assetRic = assetRic;
        this.investment = investment;
        this.openRate = openRate;
        this.uuid = uuid;
        this.createdAt = createdAt;

    };

    public void closeDeal(Date closedAt, Double closedRate){
        this.createdAt = closedAt;
        this.closedRate = closedRate;
    }

    abstract boolean isWon(Double currentRate);

    abstract Long income(Double currentRate);


}
enum Trand{
    Up,
    Down;
};

