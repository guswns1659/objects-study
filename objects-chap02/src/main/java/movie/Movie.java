package movie;

import java.time.Duration;

public class Movie {
  private String title;
  private Duration runningTime;
  private Money fee;
  private DefaultDiscountPolicy discountPolicy;

  public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy discountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.discountPolicy = discountPolicy;
  }

  public Money getFee() {
    return fee;
  }

  /** movie는 screening(상영)을 바탕으로 할인정책을 적용해 금액을 계산한다.
   */
  public Money calculateMovieFee(Screening screening) {
    return fee.minus(discountPolicy.calculateDiscountAmount(screening));
  }
}
