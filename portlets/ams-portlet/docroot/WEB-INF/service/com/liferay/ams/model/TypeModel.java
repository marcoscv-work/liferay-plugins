/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ams.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Type service. Represents a row in the &quot;AMS_Type&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ams.model.impl.TypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ams.model.impl.TypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Type
 * @see com.liferay.ams.model.impl.TypeImpl
 * @see com.liferay.ams.model.impl.TypeModelImpl
 * @generated
 */
@ProviderType
public interface TypeModel extends BaseModel<Type> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a type model instance should use the {@link Type} interface instead.
	 */

	/**
	 * Returns the primary key of this type.
	 *
	 * @return the primary key of this type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this type.
	 *
	 * @param primaryKey the primary key of this type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the type ID of this type.
	 *
	 * @return the type ID of this type
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this type.
	 *
	 * @param typeId the type ID of this type
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the group ID of this type.
	 *
	 * @return the group ID of this type
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this type.
	 *
	 * @param groupId the group ID of this type
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the name of this type.
	 *
	 * @return the name of this type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this type.
	 *
	 * @param name the name of this type
	 */
	public void setName(String name);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.ams.model.Type type);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.ams.model.Type> toCacheModel();

	@Override
	public com.liferay.ams.model.Type toEscapedModel();

	@Override
	public com.liferay.ams.model.Type toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}