 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B T r a n s f o r m R u l e   {  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B T R _ A P P E N D   = 	 5 5 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   H B T R _ J O I N   	 = 	 0 ;  
  
 	  
 	 p r i v a t e   H B W o r d 	 o _ S u f f i x   =   n u l l ;  
 	 / / p r i v a t e   H B W o r d 	 o _ R e m o v e   =   n u l l ;  
 	 p r i v a t e   i n t 	 	 i _ T y p e   =   0 ;  
 	 p r i v a t e   i n t 	 	 i _ S u b T y p e   =   0 ;  
 	 p r i v a t e   H B T r a n s f o r m R u l e S e t 	 o _ R u l e S e t   =   n u l l ;  
 	 p r i v a t e   i n t 	 	 i _ J o i n M e t h o d   =   0 ;  
 	 	  
 	 p u b l i c   H B T r a n s f o r m R u l e ( )    
 	 { 	 	  
 	 	 o _ S u f f i x   =   n e w   H B W o r d ( ) ;  
 	 }  
  
 	 p u b l i c   H B T r a n s f o r m R u l e ( i n t   i T y p e ,   i n t   i S u b T y p e ,   i n t   i J o i n M e t h o d ,   H B W o r d   o S u f f i x )    
 	 { 	  
 	 	 o _ S u f f i x   =   o S u f f i x ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 	 i _ J o i n M e t h o d   =   i J o i n M e t h o d ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e ( i n t   i T y p e ,   i n t   i S u b T y p e ,   i n t   i J o i n M e t h o d ,   S t r i n g   s S u f f i x )    
 	 { 	  
 	 	 o _ S u f f i x   =   n e w   H B W o r d ( s S u f f i x ) ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 	 i _ J o i n M e t h o d   =   i J o i n M e t h o d ;  
 	 } 	  
 	  
 	 p u b l i c   s t a t i c   H B T r a n s f o r m R u l e   E x t r a c t R u l e ( S t r i n g   s R u l e )  
 	 {  
 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x t r a c t R u l e   :   "   +   s R u l e ) ;  
 	 	 	 	  
 	 	 S t r i n g   s B a s e T o k s [ ]   =   s R u l e . s p l i t ( " [ - = + ] " ) ;  
 	 	 i f ( s B a s e T o k s . l e n g t h < 3 )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   E x t r a c t R u l e   :   I n c o r r e c t   L e n g t h   [ "   +   s B a s e T o k s . l e n g t h   +   " ]   i n   E n t r y   :   "   +   s R u l e   +   " < b r > " ) ;  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	 	  
 	 	 i n t   i T y p e   =   H e l a b a s a . m a p _ I D s . g e t ( s B a s e T o k s [ 0 ] ) . i n t V a l u e ( ) ;  
 	 	 i n t   i S u b T y p e   =   H e l a b a s a . m a p _ I D s . g e t ( s B a s e T o k s [ 1 ] ) . i n t V a l u e ( ) ;  
 	 	 S t r i n g   s V a l   =   s B a s e T o k s [ 2 ] ;  
 	 	  
 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x t r a c t R u l e   :   T = "   +   s B a s e T o k s [ 0 ]   +   "   :   S T = "   +   s B a s e T o k s [ 1 ]   +   "   :   V a l = "   +   s B a s e T o k s [ 2 ] ) ;  
 	 	  
 	 	 H B T r a n s f o r m R u l e   o R u l e   =   n u l l ;  
 	 	  
 	 	 / / H e l a b a s a . m a p _ I D s . c o n t a i n s K e y ( s v a l ) ;  
 	 	 	 	  
 	 	 / / i f (     s V a l . e q u a l s ( " L M " ) )  
 	 	 i f ( I s V i b h a k t h i I D ( s V a l ) ) 	 	  
 	 	 {  
 	 	 	 i f ( s B a s e T o k s . l e n g t h > 3 )  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ J O I N ,   s B a s e T o k s [ 3 ] ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x t r a c t R u l e   [ 1 ]   :   T = "   +   i T y p e   +   "   :   S T = "   +   i S u b T y p e   +   "   :   O = J O I N   :   S u f f i x = "   +   s B a s e T o k s [ 3 ] ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ A P P E N D ,   " " ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x t r a c t R u l e   [ 2 ]   :   T = "   +   i T y p e   +   "   :   S T = "   +   i S u b T y p e   +   "   :   O = A P P E N D   :   S u f f i x = N U L L " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / K R - D S = L M X X X  
 	 	 	 / / s B a s e T o k s [ 0 ] - s B a s e T o k s [ 1 ] = s B a s e T o k s [ 2 ] X X X  
 	 	 	 	 	 	  
 	 	 	 / / i f ( s B a s e T o k s [ 2 ] . l e n g t h ( ) > 2   & &     s B a s e T o k s [ 2 ] . s u b s t r i n g ( 0 ,   2 ) . e q u a l s ( H e l a b a s a . H B S _ L E M M A ) )  
 	 	 	 i f ( s B a s e T o k s [ 2 ] . l e n g t h ( ) > 2   & &     I s V i b h a k t h i I D ( s B a s e T o k s [ 2 ] . s u b s t r i n g ( 0 ,   2 ) ) )  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ A P P E N D ,   s B a s e T o k s [ 2 ] . s u b s t r i n g ( 2 ,   s B a s e T o k s [ 2 ] . l e n g t h ( ) ) ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x t r a c t R u l e   [ 3 ]   :   T = "   +   i T y p e   +   "   :   S T = "   +   i S u b T y p e   +   "   :   O = A P P E N D   :   S u f f i x = [ "   +   s B a s e T o k s [ 2 ] . s u b s t r i n g ( 2 ,   s B a s e T o k s [ 2 ] . l e n g t h ( ) ) +   " ] " ) ;  
 	 	 	 }  
 	 	 	 e l s e 	 	  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ A P P E N D ,   s B a s e T o k s [ 2 ] ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x t r a c t R u l e   [ 4 ]   :   T = "   +   i T y p e   +   "   :   S T = "   +   i S u b T y p e   +   "   :   O = A P P E N D   :   S u f f i x = "   +   s B a s e T o k s [ 2 ] ) ;  
 	 	 	 }  
 	 	 } 	 	  
 	 	 r e t u r n   o R u l e ;  
 	 } 	  
  
 	  
 	 p r i v a t e   s t a t i c   b o o l e a n   I s V i b h a k t h i I D ( S t r i n g   s T a g )  
 	 {  
 	 	 i f ( s T a g . e q u a l s ( H e l a b a s a . H B S _ L E M M A ) )  
 	 	 {  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 i n t   i C o u n t   =   H B N o u n . a r r _ V i b h a k t h i . l e n g t h ; ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 i f ( H B N o u n . a r r _ V i b h a k t h i [ i ] . e q u a l s ( s T a g ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	  
 	 p u b l i c   i n t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ T y p e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t S u b T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t J o i n M e t h o d ( )  
 	 {  
 	 	 r e t u r n   i _ J o i n M e t h o d ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t S u f f i x ( )  
 	 {  
 	 	 r e t u r n   o _ S u f f i x ;  
 	 }  
 	  
 	 / / R e t u r n s   a   s c o r e   r e p r e s e n t   t h e   m a t c h i n g   w i t h   f o r m  
 	 / /   L + S   - >   S  
 	 / /   L S   - >   S  
 	 p u b l i c   l o n g   M a t c h F o r m ( H B W o r d   o W o r d )  
 	 {  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( M a t c h )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 r e t u r n   o _ S u f f i x . M a t c h P a t t e r n ( o W o r d ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( D i s j o i n )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 r e t u r n   H B W o r d J o i n e r . C h e c k D i s j o i n a b l e ( o W o r d ,   o _ S u f f i x ,   f a l s e ,   1 ,   i _ T y p e ) ; 	 	 	  
 	 	 }  
 	 }  
 	  
 	  
 	 / / R e t u r n s   a   s c o r e   r e p r e s e n t   t h e   m a t c h i n g   w i t h   f o r m  
 	 / /   L + S   - >   S  
 	 / /   L S   - >   S  
 	 p u b l i c   v o i d   M a t c h F o r m ( H B W o r d   o W o r d ,   L i s t < H B W o r d >   l i s t L e m m a s )  
 	 {  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( M a t c h )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 i f ( o _ S u f f i x . M a t c h P a t t e r n ( o W o r d ) > 0 )  
 	 	 	 {  
 	 	 	 	 l i s t L e m m a s . a d d (   o _ S u f f i x . E x t r a c t V a r i a b l e P a r t ( o W o r d )   ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " - - - - - - - - - - - - - - - - - - - - - - - - - -   M a t c h i n g   F o r m s   ( D i s j o i n )   - - - - - - - - - - - - - - - - - - - - - - - - - - - -   < b r > \ r " ) ;  
 	 	 	 / / D e b u g P r i n t ( ) ;  
 	 	 	  
 	 	 	 H B J o i n R e s u l t s S e t   o R e s u l t s S e t   =   H B W o r d J o i n e r . D i s j o i n ( o W o r d ,   o _ S u f f i x ,   i _ T y p e ) ;  
 	 	 	 o R e s u l t s S e t . G e t A l l R e s u l t s ( l i s t L e m m a s ) ;  
 	 	 }  
 	 }  
  
  
 	 / / R e t u r n s   a   n o r m a l i z e d   L e m m a   f o r m   o f   t h e   g i v e n   w o r d   a c c o r d i n g   t o   t h i s   r u l e  
 	 / /   L + S   - >   L  
 	 / /   L S   - >   L 	  
 	 p u b l i c   L i s t < H B W o r d >   E x t r a c t L e m m a ( H B W o r d   o W o r d )  
 	 {  
 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 { 	 	 	  
 	 	 	 o W o r d L i s t . a d d ( o _ S u f f i x . E x t r a c t V a r i a b l e P a r t ( o W o r d ) ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 { 	 	 	 	  
 	 	 	 H B J o i n R e s u l t s S e t   o R e s u l t s S e t   =   H B W o r d J o i n e r . D i s j o i n ( o W o r d ,   o _ S u f f i x ,   i _ T y p e ) ;  
 	 	 	 o R e s u l t s S e t . G e t A l l R e s u l t s ( o W o r d L i s t ) ;  
 	 	 }  
 	 	 r e t u r n   o W o r d L i s t ;  
 	 }  
  
 	 / /   L ,   S   - >   L + S  
 	 / /   L ,   S   - >   L S  
 	 p u b l i c   H B W o r d   G e n e r a t e B e s t F o r m ( H B W o r d   o L e m m a ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r i n g A l g o )  
 	 { 	 	  
 	 	 H B W o r d   o F o r m   =   n u l l ;  
 	 	  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 { 	 	 	  
 	 	 	 i f ( o _ S u f f i x . G e t B a s e C h a r a c t e r C o u n t ( ) = = 0 )  
 	 	 	 {  
 	 	 	 	 o F o r m   =   o L e m m a . C l o n e ( ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o F o r m   =   o _ S u f f i x . A p p l y P a t t e r n ( o L e m m a ) ;  
 	 	 	 } 	 	 	  
 	 	 	 H B C o r p u s . G e t W o r d F r e q u e n c y ( o F o r m ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 { 	  
 	 	 	 i n t   i J o i n M o d e   =   H B W o r d J o i n e r . J O I N _ M O D E _ U N I V E R S A L ;   / / J O I N _ M O D E _ N O U N   :   B u g   F i x   :   m e s a y a   +   e n   :   2 0 1 7 - 0 5 - 2 8      
 	 	 	  
 	 	 	 i f ( o _ R u l e S e t ! = n u l l )  
 	 	 	 {  
 	 	 	 	 i J o i n M o d e   =   o _ R u l e S e t . G e t T y p e ( ) ;  
 	 	 	 }  
 	 	 	  
 	 	 	   H B J o i n R e s u l t s S e t   o R e s u l t S e t   =   H B W o r d J o i n e r . J o i n ( o L e m m a ,   o _ S u f f i x ,   i J o i n M o d e ) ;  
 	 	 	 	 	    
 	 	 	   o J o i n S c o r i n g A l g o . E v a l u a t e ( o R e s u l t S e t ) ;  
 	 	 	   H B J o i n R e s u l t s   o B e s t R e s u l t   =   o R e s u l t S e t . G e t B e s t R e s u l t s ( ) ;  
 	 	 	   i f ( o B e s t R e s u l t ! = n u l l )  
 	 	 	   { 	 	 	 	    
 	 	 	 	   o F o r m   =   o B e s t R e s u l t . G e t R e s u l t ( ) ;  
 	 	 	 	   o F o r m . S e t F r e q u e n c y ( o B e s t R e s u l t . G e t S c o r e ( ) ) ;  
 	 	 	   }  
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " G e n e r a t e F o r m   :   "   +     o L e m m a . G e t N a t u r a l F o r m ( )   +   "   +   "   +      
 	 	 	 / / 	 	 o _ S u f f i x . G e t N a t u r a l F o r m ( )   +   "   :   "   +   o W o r d L i s t . s i z e ( )   +   "   P o s s i b i l i t i e s " +   " < b r > \ n \ r " ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   o F o r m ;  
 	 } 	  
 	  
 	 / /   L ,   S   - >   L + S  
 	 / /   L ,   S   - >   L S  
 	 p u b l i c   L i s t < H B W o r d >   G e n e r a t e F o r m ( H B W o r d   o L e m m a ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r i n g A l g o )  
 	 {  
 	 	  
 	 	 L i s t < H B W o r d >   o W o r d L i s t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 {  
 	 	 	 o W o r d L i s t   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 	  
 	 	 	 i f ( o _ S u f f i x . G e t B a s e C h a r a c t e r C o u n t ( ) = = 0 )  
 	 	 	 {  
 	 	 	 	 o W o r d L i s t . a d d ( o L e m m a . C l o n e ( ) ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 	 o W o r d L i s t . a d d ( o _ S u f f i x . A p p l y P a t t e r n ( o L e m m a ) ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 { 	 	 	 	    
 	 	 	   H B J o i n R e s u l t s S e t   o R e s u l t S e t   =   H B W o r d J o i n e r . J o i n ( o L e m m a ,   o _ S u f f i x ,   o _ R u l e S e t . G e t T y p e ( ) ) ;  
 	 	 	   o J o i n S c o r i n g A l g o . E v a l u a t e ( o R e s u l t S e t ) ; 	 	  
 	 	 	    
 	 	 	   o R e s u l t S e t . G e t A l l P o s i t i v e R e s u l t s ( o W o r d L i s t ) ; 	 	 	   	 	   	   	 	 	    
 	 	 	    
 	 	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " G e n e r a t e F o r m   :   "   +     o L e m m a . G e t N a t u r a l F o r m ( )   +   "   +   "   +      
 	 	 	 / / 	 	 o _ S u f f i x . G e t N a t u r a l F o r m ( )   +   "   :   "   +   o W o r d L i s t . s i z e ( )   +   "   P o s s i b i l i t i e s " +   " < b r > \ n \ r " ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   o W o r d L i s t ;  
 	 }  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 i f ( i _ J o i n M e t h o d = = H B T R _ A P P E N D )  
 	 	 { 	  
 	 	 	 i f ( o _ S u f f i x ! = n u l l   & &   o _ S u f f i x . G e t B a s e C h a r a c t e r C o u n t ( ) > 0 )  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " R u l e   :   "   +     H B N o u n . a r r _ V i b h a k t h i [ i _ T y p e ] +   " [ "   +   i _ T y p e   +   " ]   :   "   +     H B N o u n . a r r _ N o u n C a t e g o r i e s [ i _ S u b T y p e ]   +   "   =   L M   |   "   +   o _ S u f f i x . G e t N a t u r a l F o r m ( )   +   " < b r > " ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " R u l e   :   "   +     H B N o u n . a r r _ V i b h a k t h i [ i _ T y p e ] +   " [ "   +   i _ T y p e   +   " ]   :   "   +     H B N o u n . a r r _ N o u n C a t e g o r i e s [ i _ S u b T y p e ]   +   "   =   L M   < b r > " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " R u l e   :   "   +     H B N o u n . a r r _ V i b h a k t h i [ i _ T y p e ] +   " [ "   +   i _ T y p e   +   " ]   :   "   +     H B N o u n . a r r _ N o u n C a t e g o r i e s [ i _ S u b T y p e ]   +   "   =   L M   +   "   +   o _ S u f f i x . G e t N a t u r a l F o r m ( )   +   " < b r > " ) ;  
 	 	 }  
 	 }  
 	  
 	  
 	 p u b l i c   v o i d   S e t R u l e S e t ( H B T r a n s f o r m R u l e S e t   o R u l e S e t )  
 	 {  
 	 	 o _ R u l e S e t   =   o R u l e S e t ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e S e t ;  
 	 }  
 }  
