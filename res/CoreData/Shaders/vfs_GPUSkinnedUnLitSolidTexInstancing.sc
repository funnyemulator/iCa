�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�5py|pj���Rv��!B1��!�u�'aQ����ؕpՀ��$HH�zL�hC��J���WA�W�(?g�2+�W4��lD�����o�;Z��"4�壜�C������*��M8�`����5W#*��pP�a(Έ�鵰�9��{�� ��BT1�ֈ�시�V�.{3b�ϊ���=mS���N�Ve(iYE����ЋG$��\L��t�>_�\���L��x�d˶�m ����V6�4�H�n��k^��P�:TEn�Zc@������M@��޳6�Ob�.P�p��5g(Ņ�F�?�����-�4#�%�ن�I����-,ߧ�"q�y=�U�D�����Y��u�9�M��x��]o,P��A��;�8���ZKP��,�[?@'��-W����r���x����1��@6�����qVmp�jL�{ye��+W1yI/�����ydef FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif5useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
