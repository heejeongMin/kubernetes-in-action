package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1beta1PodDisruptionBudgetStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public A addToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1Condition item);
  public A setToConditions(java.lang.Integer index,io.kubernetes.client.openapi.models.V1Condition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1Condition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items);
  public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1Condition> items);
  public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1Condition> getConditions();
  public java.util.List<io.kubernetes.client.openapi.models.V1Condition> buildConditions();
  public io.kubernetes.client.openapi.models.V1Condition buildCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1Condition buildFirstCondition();
  public io.kubernetes.client.openapi.models.V1Condition buildLastCondition();
  public io.kubernetes.client.openapi.models.V1Condition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1Condition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions);
  public java.lang.Boolean hasConditions();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> addNewCondition();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1Condition item);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> setNewConditionLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V1Condition item);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editCondition(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editFirstCondition();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editLastCondition();
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ConditionBuilder> predicate);
  public java.lang.Integer getCurrentHealthy();
  public A withCurrentHealthy(java.lang.Integer currentHealthy);
  public java.lang.Boolean hasCurrentHealthy();
  public java.lang.Integer getDesiredHealthy();
  public A withDesiredHealthy(java.lang.Integer desiredHealthy);
  public java.lang.Boolean hasDesiredHealthy();
  public A addToDisruptedPods(java.lang.String key,java.time.OffsetDateTime value);
  public A addToDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> map);
  public A removeFromDisruptedPods(java.lang.String key);
  public A removeFromDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> map);
  public java.util.Map<java.lang.String,java.time.OffsetDateTime> getDisruptedPods();
  public <K,V>A withDisruptedPods(java.util.Map<java.lang.String,java.time.OffsetDateTime> disruptedPods);
  public java.lang.Boolean hasDisruptedPods();
  public java.lang.Integer getDisruptionsAllowed();
  public A withDisruptionsAllowed(java.lang.Integer disruptionsAllowed);
  public java.lang.Boolean hasDisruptionsAllowed();
  public java.lang.Integer getExpectedPods();
  public A withExpectedPods(java.lang.Integer expectedPods);
  public java.lang.Boolean hasExpectedPods();
  public java.lang.Long getObservedGeneration();
  public A withObservedGeneration(java.lang.Long observedGeneration);
  public java.lang.Boolean hasObservedGeneration();
  public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ConditionFluent<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  
}