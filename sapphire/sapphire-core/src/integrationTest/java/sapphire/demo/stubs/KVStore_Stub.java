/*
 * Stub for class sapphire.demo.KVStore
 * Generated by Sapphire Compiler (sc).
 *
 * <strong>Do NOT remove this stub class.</strong>
 *
 * This class will be used in unit tests and
 * integration tests. Our gradle script will not
 * automatically generate stubs for SO classes
 * living in <code>test</code> directory. If you
 * modify {@code KVStore.java}, please remember to
 * modify this file accordingly.
 */
package sapphire.demo.stubs;

public final class KVStore_Stub extends sapphire.demo.KVStore
        implements sapphire.common.AppObjectStub {

    sapphire.policy.SapphirePolicy.SapphireClientPolicy $__client = null;
    boolean $__directInvocation = false;

    public KVStore_Stub() {
        super();
    }

    public void $__initialize(sapphire.policy.SapphirePolicy.SapphireClientPolicy client) {
        $__client = client;
    }

    public void $__initialize(boolean directInvocation) {
        $__directInvocation = directInvocation;
    }

    public Object $__clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Implementation of startTransaction(long)
    public void startTransaction(long $param_long_1) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.startTransaction($param_long_1);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public void sapphire.demo.KVStore.startTransaction(long)";
            $__params.add($param_long_1);
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of startTransaction()
    public void startTransaction() throws java.lang.Exception {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.startTransaction();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.startTransaction() throws java.lang.Exception";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of set(String, Serializable)
    public void set(java.lang.String $param_String_1, java.io.Serializable $param_Serializable_2) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.set($param_String_1, $param_Serializable_2);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.set(java.lang.String,java.io.Serializable)";
            $__params.add($param_String_1);
            $__params.add($param_Serializable_2);
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of saveCheckpoint()
    public void saveCheckpoint() throws java.lang.Exception {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.saveCheckpoint();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.saveCheckpoint() throws java.lang.Exception";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of rollbackTransaction()
    public void rollbackTransaction() throws java.lang.Exception {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.rollbackTransaction();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.rollbackTransaction() throws java.lang.Exception";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of restoreCheckpoint()
    public void restoreCheckpoint() throws java.lang.Exception {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.restoreCheckpoint();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.restoreCheckpoint() throws java.lang.Exception";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of push()
    public void push() {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.push();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public void sapphire.demo.KVStore.push()";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of pull()
    public void pull() {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.pull();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method = "public void sapphire.demo.KVStore.pull()";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of migrateObject(InetSocketAddress)
    public void migrateObject(java.net.InetSocketAddress $param_InetSocketAddress_1)
            throws sapphire.policy.mobility.explicitmigration.MigrationException {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.migrateObject($param_InetSocketAddress_1);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.migrateObject(java.net.InetSocketAddress) throws sapphire.policy.mobility.explicitmigration.MigrationException";
            $__params.add($param_InetSocketAddress_1);
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof sapphire.policy.mobility.explicitmigration.MigrationException) {
                    throw (sapphire.policy.mobility.explicitmigration.MigrationException) ex;
                } else if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    // Implementation of get(String)
    public java.io.Serializable get(java.lang.String $param_String_1) {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                $__result = super.get($param_String_1);
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public java.io.Serializable sapphire.demo.KVStore.get(java.lang.String)";
            $__params.add($param_String_1);
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        return ((java.io.Serializable) $__result);
    }

    // Implementation of commitTransaction()
    public void commitTransaction() throws java.lang.Exception {
        java.lang.Object $__result = null;
        if ($__directInvocation) {
            try {
                super.commitTransaction();
            } catch (java.lang.Exception e) {
                throw new sapphire.common.AppExceptionWrapper(e);
            }
        } else {
            java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
            String $__method =
                    "public void sapphire.demo.KVStore.commitTransaction() throws java.lang.Exception";
            try {
                $__result = $__client.onRPC($__method, $__params);
            } catch (sapphire.common.AppExceptionWrapper e) {
                Exception ex = e.getException();
                if (ex instanceof java.lang.RuntimeException) {
                    throw (java.lang.RuntimeException) ex;
                } else {
                    throw new java.lang.RuntimeException(ex);
                }
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }
}
