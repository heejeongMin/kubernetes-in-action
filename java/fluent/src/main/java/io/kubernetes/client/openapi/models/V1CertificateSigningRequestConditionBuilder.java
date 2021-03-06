package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CertificateSigningRequestConditionBuilder extends io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluentImpl<io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition,io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionBuilder>{
  public V1CertificateSigningRequestConditionBuilder() {
    this(false);
  }
  public V1CertificateSigningRequestConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CertificateSigningRequestCondition(), validationEnabled);
  }
  public V1CertificateSigningRequestConditionBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CertificateSigningRequestConditionBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CertificateSigningRequestCondition(), validationEnabled);
  }
  public V1CertificateSigningRequestConditionBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition instance) {
    this(fluent, instance, false);
  }
  public V1CertificateSigningRequestConditionBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withLastUpdateTime(instance.getLastUpdateTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1CertificateSigningRequestConditionBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition instance) {
    this(instance,false);
  }
  public V1CertificateSigningRequestConditionBuilder(io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withLastUpdateTime(instance.getLastUpdateTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CertificateSigningRequestConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition build() {
    V1CertificateSigningRequestCondition buildable = new V1CertificateSigningRequestCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CertificateSigningRequestConditionBuilder that = (V1CertificateSigningRequestConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}