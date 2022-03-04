package com.example.demo_new;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AddressBookApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testNewAddressBook() throws Exception {
        this.mvc.perform(post("/NewAddressBook")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("New AddressBook Started with id")));
    }

    @Test
    public void testAddBuddy() throws Exception {
        this.mvc.perform(post("/NewAddressBook"));
        this.mvc.perform((post("/AddBuddyInfo")
                .param("addressBookID", "1")
                .param("buddyInfoName", "khalil")
                .param("buddyInfoPhoneNumber", "613")))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("added Buddy")));
    }

    @Test
    public void testRemoveBuddy() throws Exception {
        this.mvc.perform(post("/NewAddressBook"));
        this.mvc.perform((post("/AddBuddyInfo")
                        .param("addressBookID", "1")
                        .param("buddyInfoName", "khalil")
                        .param("buddyInfoPhoneNumber", "613")));

        this.mvc.perform(delete("/DeleteBuddyInfo")
                .param("addressBookID", "1")
                .param("index", "0"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("removing Buddy with ID")));
    }

}
