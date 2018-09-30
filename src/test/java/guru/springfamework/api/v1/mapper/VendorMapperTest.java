package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendorMapperTest {

    public static final Long id = 1L;
    public static final String name = "Hot Buttered Slugs, Inc";
    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() {

        //given
        Vendor vendor = new Vendor();
        vendor.setId(id);
        vendor.setName(name);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        //then
        assertEquals(name, vendorDTO.getName());
    }

    @Test
    public void vendorDTOtoVendor() {
        //given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(name);

        //when
        Vendor vendor = vendorMapper.vendorDtoToVendor(vendorDTO);

        //then
        assertEquals(vendorDTO.getName(), vendor.getName());
    }


}