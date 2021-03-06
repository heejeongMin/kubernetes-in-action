package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1EventBuilder extends io.kubernetes.client.openapi.models.V1beta1EventFluentImpl<io.kubernetes.client.openapi.models.V1beta1EventBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1Event,io.kubernetes.client.openapi.models.V1beta1EventBuilder>{
  public V1beta1EventBuilder() {
    this(false);
  }
  public V1beta1EventBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1Event(), validationEnabled);
  }
  public V1beta1EventBuilder(io.kubernetes.client.openapi.models.V1beta1EventFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1EventBuilder(io.kubernetes.client.openapi.models.V1beta1EventFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1Event(), validationEnabled);
  }
  public V1beta1EventBuilder(io.kubernetes.client.openapi.models.V1beta1EventFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1Event instance) {
    this(fluent, instance, false);
  }
  public V1beta1EventBuilder(io.kubernetes.client.openapi.models.V1beta1EventFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1Event instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAction(instance.getAction());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDeprecatedCount(instance.getDeprecatedCount());

    fluent.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp());

    fluent.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp());

    fluent.withDeprecatedSource(instance.getDeprecatedSource());

    fluent.withEventTime(instance.getEventTime());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withNote(instance.getNote());

    fluent.withReason(instance.getReason());

    fluent.withRegarding(instance.getRegarding());

    fluent.withRelated(instance.getRelated());

    fluent.withReportingController(instance.getReportingController());

    fluent.withReportingInstance(instance.getReportingInstance());

    fluent.withSeries(instance.getSeries());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1EventBuilder(io.kubernetes.client.openapi.models.V1beta1Event instance) {
    this(instance,false);
  }
  public V1beta1EventBuilder(io.kubernetes.client.openapi.models.V1beta1Event instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAction(instance.getAction());

    this.withApiVersion(instance.getApiVersion());

    this.withDeprecatedCount(instance.getDeprecatedCount());

    this.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp());

    this.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp());

    this.withDeprecatedSource(instance.getDeprecatedSource());

    this.withEventTime(instance.getEventTime());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withNote(instance.getNote());

    this.withReason(instance.getReason());

    this.withRegarding(instance.getRegarding());

    this.withRelated(instance.getRelated());

    this.withReportingController(instance.getReportingController());

    this.withReportingInstance(instance.getReportingInstance());

    this.withSeries(instance.getSeries());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1EventFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1Event build() {
    V1beta1Event buildable = new V1beta1Event();
    buildable.setAction(fluent.getAction());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeprecatedCount(fluent.getDeprecatedCount());
    buildable.setDeprecatedFirstTimestamp(fluent.getDeprecatedFirstTimestamp());
    buildable.setDeprecatedLastTimestamp(fluent.getDeprecatedLastTimestamp());
    buildable.setDeprecatedSource(fluent.getDeprecatedSource());
    buildable.setEventTime(fluent.getEventTime());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setNote(fluent.getNote());
    buildable.setReason(fluent.getReason());
    buildable.setRegarding(fluent.getRegarding());
    buildable.setRelated(fluent.getRelated());
    buildable.setReportingController(fluent.getReportingController());
    buildable.setReportingInstance(fluent.getReportingInstance());
    buildable.setSeries(fluent.getSeries());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1EventBuilder that = (V1beta1EventBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}