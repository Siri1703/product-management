package com.example.demo;

import org.springframework.stereotype.Component;

 class gadgets {
    private String id;
    private String type;

     public gadgets(String id, String type) {
         this.id = id;
         this.type = type;
     }
/* public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }*/

    public String toString()
    {
        return this.id+" "+this.type;
    }
}
