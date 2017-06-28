package org.bitcoin.market.bean;

/**
 * Created by lichang on 14-2-26.
 */

public enum Symbol {
    btc {
        @Override
        public boolean isBtc() {
            return true;
        }

        @Override
        public boolean isLtc() {
            return false;
        }

        @Override
        public boolean isUsd() {
            return false;
        }

        @Override
        public boolean isCny() {
            return false;
        }

		@Override
		public boolean isSc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isBts() {
			// TODO Auto-generated method stub
			return false;
		}
    }, ltc {
        @Override
        public boolean isBtc() {
            return false;
        }

        @Override
        public boolean isLtc() {
            return true;
        }

        @Override
        public boolean isUsd() {
            return false;
        }

        @Override
        public boolean isCny() {
            return false;
        }

		@Override
		public boolean isSc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isBts() {
			// TODO Auto-generated method stub
			return false;
		}
    }, usd {
        @Override
        public boolean isBtc() {
            return false;
        }

        @Override
        public boolean isLtc() {
            return false;
        }

        @Override
        public boolean isUsd() {
            return true;
        }

        @Override
        public boolean isCny() {
            return false;
        }

		@Override
		public boolean isSc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isBts() {
			// TODO Auto-generated method stub
			return false;
		}
    }, cny {
        @Override
        public boolean isBtc() {
            return false;
        }

        @Override
        public boolean isLtc() {
            return false;
        }

        @Override
        public boolean isUsd() {
            return false;
        }

        @Override
        public boolean isCny() {
            return true;
        }

		@Override
		public boolean isSc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isBts() {
			// TODO Auto-generated method stub
			return false;
		}
    },sc{

		@Override
		public boolean isBtc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isLtc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isUsd() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCny() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSc() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isBts() {
			// TODO Auto-generated method stub
			return false;
		}
    	
    },bts{

		@Override
		public boolean isBtc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isLtc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isUsd() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCny() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSc() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isBts() {
			// TODO Auto-generated method stub
			return true;
		}
    	
    };

    public abstract boolean isBtc();

    public abstract boolean isLtc();

    public abstract boolean isUsd();

    public abstract boolean isCny();
    
    public abstract boolean isSc();
    
    public abstract boolean isBts();
    
    public static void main(String[] args) {
    Symbol s = Symbol.valueOf("sc");
    System.out.println(s.isSc());
	}
}

