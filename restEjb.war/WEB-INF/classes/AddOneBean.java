package com.redhat;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import org.jboss.ejb3.annotation.LocalBinding;
import org.jboss.ejb3.annotation.RemoteBinding;

@Stateless
@Local(AddOneLocal.class)
@LocalBinding(jndiBinding="redhat/AddOneBean/local")
@Remote(AddOneRemote.class)
@RemoteBinding(jndiBinding="redhat/AddOneBean/remote")
public class AddOneBean implements AddOneLocal, AddOneRemote {
    @Override
    public int addOne(int start) {
        return start + 1;
    }
}

