/*
 * Copyright 2022 Netflix, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netflix.conductor.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.workflow.WorkflowDef;

import com.google.common.base.Preconditions;

import static com.netflix.conductor.domain.WorkflowStatusDO.RUNNING;

public class WorkflowDO {

    private String ownerApp;

    private Long createdTime;

    private Long updatedTime;

    private String createdBy;

    private String updatedBy;

    private WorkflowStatusDO status = RUNNING;

    private long endTime;

    private String workflowId;

    private String parentWorkflowId;

    private String parentWorkflowTaskId;

    private List<Task> tasks = new LinkedList<>();

    private Map<String, Object> input = new HashMap<>();

    private Map<String, Object> output = new HashMap<>();

    // ids 10,11 are reserved

    private String correlationId;

    private String reRunFromWorkflowId;

    private String reasonForIncompletion;

    // id 15 is reserved

    private String event;

    private Map<String, String> taskToDomain = new HashMap<>();

    private Set<String> failedReferenceTaskNames = new HashSet<>();

    private WorkflowDef workflowDefinition;

    private String externalInputPayloadStoragePath;

    private String externalOutputPayloadStoragePath;

    private int priority;

    private Map<String, Object> variables = new HashMap<>();

    private long lastRetriedTime;

    public String getOwnerApp() {
        return ownerApp;
    }

    public void setOwnerApp(String ownerApp) {
        this.ownerApp = ownerApp;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public WorkflowStatusDO getStatus() {
        return status;
    }

    public void setStatus(WorkflowStatusDO status) {
        this.status = status;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public String getParentWorkflowId() {
        return parentWorkflowId;
    }

    public void setParentWorkflowId(String parentWorkflowId) {
        this.parentWorkflowId = parentWorkflowId;
    }

    public String getParentWorkflowTaskId() {
        return parentWorkflowTaskId;
    }

    public void setParentWorkflowTaskId(String parentWorkflowTaskId) {
        this.parentWorkflowTaskId = parentWorkflowTaskId;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Map<String, Object> getInput() {
        return input;
    }

    public void setInput(Map<String, Object> input) {
        this.input = input;
    }

    public Map<String, Object> getOutput() {
        return output;
    }

    public void setOutput(Map<String, Object> output) {
        this.output = output;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getReRunFromWorkflowId() {
        return reRunFromWorkflowId;
    }

    public void setReRunFromWorkflowId(String reRunFromWorkflowId) {
        this.reRunFromWorkflowId = reRunFromWorkflowId;
    }

    public String getReasonForIncompletion() {
        return reasonForIncompletion;
    }

    public void setReasonForIncompletion(String reasonForIncompletion) {
        this.reasonForIncompletion = reasonForIncompletion;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Map<String, String> getTaskToDomain() {
        return taskToDomain;
    }

    public void setTaskToDomain(Map<String, String> taskToDomain) {
        this.taskToDomain = taskToDomain;
    }

    public Set<String> getFailedReferenceTaskNames() {
        return failedReferenceTaskNames;
    }

    public void setFailedReferenceTaskNames(Set<String> failedReferenceTaskNames) {
        this.failedReferenceTaskNames = failedReferenceTaskNames;
    }

    public WorkflowDef getWorkflowDefinition() {
        return workflowDefinition;
    }

    public void setWorkflowDefinition(WorkflowDef workflowDefinition) {
        this.workflowDefinition = workflowDefinition;
    }

    public String getExternalInputPayloadStoragePath() {
        return externalInputPayloadStoragePath;
    }

    public void setExternalInputPayloadStoragePath(String externalInputPayloadStoragePath) {
        this.externalInputPayloadStoragePath = externalInputPayloadStoragePath;
    }

    public String getExternalOutputPayloadStoragePath() {
        return externalOutputPayloadStoragePath;
    }

    public void setExternalOutputPayloadStoragePath(String externalOutputPayloadStoragePath) {
        this.externalOutputPayloadStoragePath = externalOutputPayloadStoragePath;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    public long getLastRetriedTime() {
        return lastRetriedTime;
    }

    public void setLastRetriedTime(long lastRetriedTime) {
        this.lastRetriedTime = lastRetriedTime;
    }

    /**
     * Convenience method for accessing the workflow definition name.
     *
     * @return the workflow definition name.
     */
    public String getWorkflowName() {
        Preconditions.checkNotNull(workflowDefinition, "Workflow definition is null");
        return workflowDefinition.getName();
    }

    /**
     * Convenience method for accessing the workflow definition version.
     *
     * @return the workflow definition version.
     */
    public int getWorkflowVersion() {
        Preconditions.checkNotNull(workflowDefinition, "Workflow definition is null");
        return workflowDefinition.getVersion();
    }
}
