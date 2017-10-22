package hello.services;

import hello.Tshirt;
import hello.TshirtOrder;
import hello.TshirtOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class TshirtOrderService {

    @Autowired
    private TshirtOrderRepository orderRepository;

    protected EntityManager em;

    public TshirtOrderService(EntityManager em) {
        this.em = em;
    }

    public TshirtOrder createTshirtOrder(
            Long tshirtId,
            String email,
            String name,
            String address1,
            String address2,
            String city,
            String stateOrProvince,
            String postalCode,
            String country
    ) {

        try {

            Tshirt tshirt = em.find(Tshirt.class, tshirtId);

            if (tshirt != null) {
                TshirtOrder order = new TshirtOrder();

                order.setTshirt(tshirt);
                order.setEmail(email);
                order.setName(name);
                order.setAddress1(address1);
                order.setAddress2(address2);
                order.setCity(city);
                order.setStateOrProvince(stateOrProvince);
                order.setPostalCode(postalCode);
                order.setCountry(country);
                orderRepository.save(order);

                em.close();
                return order;
            }

        } catch(Exception e) {
            throw e;
        }

        return null;
    }
}
