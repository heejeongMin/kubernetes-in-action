package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1HorizontalPodAutoscalerStatusBuilder extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluentImpl<io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus,io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusBuilder>{
  public V1HorizontalPodAutoscalerStatusBuilder() {
    this(false);
  }
  public V1HorizontalPodAutoscalerStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1HorizontalPodAutoscalerStatus(), validationEnabled);
  }
  public V1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus instance) {
    this(fluent, instance, false);
  }
  public V1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());

    fluent.withCurrentReplicas(instance.getCurrentReplicas());

    fluent.withDesiredReplicas(instance.getDesiredReplicas());

    fluent.withLastScaleTime(instance.getLastScaleTime());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  public V1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus instance) {
    this(instance,false);
  }
  public V1HorizontalPodAutoscalerStatusBuilder(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus build() {
    V1HorizontalPodAutoscalerStatus buildable = new V1HorizontalPodAutoscalerStatus();
    buildable.setCurrentCPUUtilizationPercentage(fluent.getCurrentCPUUtilizationPercentage());
    buildable.setCurrentReplicas(fluent.getCurrentReplicas());
    buildable.setDesiredReplicas(fluent.getDesiredReplicas());
    buildable.setLastScaleTime(fluent.getLastScaleTime());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HorizontalPodAutoscalerStatusBuilder that = (V1HorizontalPodAutoscalerStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}