package movie;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  /** Screening의 시간이 기간 할인의 시작, 끝 시간 중간에 있어야함.
   */
  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
        startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
        endTime.compareTo(screening.getStartTime().toLocalTime()) >=0;
  }
}
