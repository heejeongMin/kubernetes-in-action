package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PolicyRuleBuilder extends io.kubernetes.client.openapi.models.V1PolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1PolicyRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PolicyRule,io.kubernetes.client.openapi.models.V1PolicyRuleBuilder>{
  public V1PolicyRuleBuilder() {
    this(false);
  }
  public V1PolicyRuleBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PolicyRule(), validationEnabled);
  }
  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PolicyRule(), validationEnabled);
  }
  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1PolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1PolicyRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withNonResourceURLs(instance.getNonResourceURLs());

    fluent.withResourceNames(instance.getResourceNames());

    fluent.withResources(instance.getResources());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRule instance) {
    this(instance,false);
  }
  public V1PolicyRuleBuilder(io.kubernetes.client.openapi.models.V1PolicyRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withNonResourceURLs(instance.getNonResourceURLs());

    this.withResourceNames(instance.getResourceNames());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PolicyRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PolicyRule build() {
    V1PolicyRule buildable = new V1PolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setNonResourceURLs(fluent.getNonResourceURLs());
    buildable.setResourceNames(fluent.getResourceNames());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PolicyRuleBuilder that = (V1PolicyRuleBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}