package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CronJobBuilder extends io.kubernetes.client.openapi.models.V1CronJobFluentImpl<io.kubernetes.client.openapi.models.V1CronJobBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CronJob,io.kubernetes.client.openapi.models.V1CronJobBuilder>{
  public V1CronJobBuilder() {
    this(false);
  }
  public V1CronJobBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CronJob(), validationEnabled);
  }
  public V1CronJobBuilder(io.kubernetes.client.openapi.models.V1CronJobFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CronJobBuilder(io.kubernetes.client.openapi.models.V1CronJobFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CronJob(), validationEnabled);
  }
  public V1CronJobBuilder(io.kubernetes.client.openapi.models.V1CronJobFluent<?> fluent,io.kubernetes.client.openapi.models.V1CronJob instance) {
    this(fluent, instance, false);
  }
  public V1CronJobBuilder(io.kubernetes.client.openapi.models.V1CronJobFluent<?> fluent,io.kubernetes.client.openapi.models.V1CronJob instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1CronJobBuilder(io.kubernetes.client.openapi.models.V1CronJob instance) {
    this(instance,false);
  }
  public V1CronJobBuilder(io.kubernetes.client.openapi.models.V1CronJob instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CronJobFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CronJob build() {
    V1CronJob buildable = new V1CronJob();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CronJobBuilder that = (V1CronJobBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}