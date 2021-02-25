package com.qa.ims.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.dao.OrderDetailDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderDetail;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderDAO dao;
    @Mock
    private OrderDetailDAO daod;
    @Mock
    private ItemDAO idao;
    @Mock
    private CustomerDAO cdao;

	@InjectMocks
	private OrderController controller;

	@Test
	public void testCreate() {
		final Long CUSTID = 1L;
        final Long ITEMID = 1L;
        final Long QUANTITY = 5L;
		final Order created = new Order(CUSTID);
        final OrderDetail createdD = new OrderDetail(null, ITEMID, QUANTITY);
        final Item item = new Item(ITEMID, "", 1D);

		Mockito.when(utils.getLong()).thenReturn(CUSTID, ITEMID, QUANTITY, -1L);
		Mockito.when(dao.create(created)).thenReturn(created);
        Mockito.when(daod.create(createdD)).thenReturn(createdD);
        Mockito.when(idao.read(ITEMID)).thenReturn(item);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(4)).getLong();
		Mockito.verify(dao, Mockito.times(1)).create(created);
        Mockito.verify(daod, Mockito.times(1)).create(createdD);
	}

	@Test
	public void testReadAll() {
		List<Order> Orders = new ArrayList<>();
		Orders.add(new Order(1L));

		Mockito.when(dao.readAll()).thenReturn(Orders);

		assertEquals(Orders, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
        final Long ORDERID = 1L;
        final Long CUSTID = 1L;
        final Long ITEMID = 1L;
        final Long QUANTITY = 1L;
		final Order created = new Order(CUSTID);
        final OrderDetail createdD = new OrderDetail(null, ITEMID, QUANTITY);
        final Item item = new Item(ITEMID, "", 1D);

		Mockito.when(utils.getLong()).thenReturn(ORDERID, CUSTID, ITEMID, QUANTITY, -1L);
		Mockito.when(dao.create(created)).thenReturn(created);
        Mockito.when(daod.create(createdD)).thenReturn(createdD);
        Mockito.when(idao.read(ITEMID)).thenReturn(item);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(5)).getLong();
		Mockito.verify(dao, Mockito.times(1)).create(created);
        Mockito.verify(daod, Mockito.times(1)).create(createdD);

	}

	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID, -2L);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}

}
