/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.client.model.nodes.objects;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.sdk.client.model.nodes.variables.PropertyTypeNode;
import org.eclipse.milo.opcua.sdk.client.model.types.objects.AuditCertificateEventType;
import org.eclipse.milo.opcua.stack.core.types.builtin.ByteString;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;

public class AuditCertificateEventTypeNode extends AuditSecurityEventTypeNode implements AuditCertificateEventType {
    public AuditCertificateEventTypeNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    public CompletableFuture<PropertyTypeNode> getCertificateNode() {
        return getPropertyNode(AuditCertificateEventType.CERTIFICATE);
    }

    public CompletableFuture<ByteString> getCertificate() {
        return getProperty(AuditCertificateEventType.CERTIFICATE);
    }

    public CompletableFuture<StatusCode> setCertificate(ByteString value) {
        return setProperty(AuditCertificateEventType.CERTIFICATE, value);
    }
}
