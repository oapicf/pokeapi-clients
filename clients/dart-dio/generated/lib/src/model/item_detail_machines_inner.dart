//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail_machines_inner.g.dart';

/// ItemDetailMachinesInner
///
/// Properties:
/// * [machine] 
/// * [versionGroup] 
@BuiltValue()
abstract class ItemDetailMachinesInner implements Built<ItemDetailMachinesInner, ItemDetailMachinesInnerBuilder> {
  @BuiltValueField(wireName: r'machine')
  String get machine;

  @BuiltValueField(wireName: r'version_group')
  AbilityDetailPokemonInnerPokemon get versionGroup;

  ItemDetailMachinesInner._();

  factory ItemDetailMachinesInner([void updates(ItemDetailMachinesInnerBuilder b)]) = _$ItemDetailMachinesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDetailMachinesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDetailMachinesInner> get serializer => _$ItemDetailMachinesInnerSerializer();
}

class _$ItemDetailMachinesInnerSerializer implements PrimitiveSerializer<ItemDetailMachinesInner> {
  @override
  final Iterable<Type> types = const [ItemDetailMachinesInner, _$ItemDetailMachinesInner];

  @override
  final String wireName = r'ItemDetailMachinesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDetailMachinesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'machine';
    yield serializers.serialize(
      object.machine,
      specifiedType: const FullType(String),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemDetailMachinesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDetailMachinesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'machine':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.machine = valueDes;
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.versionGroup.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemDetailMachinesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDetailMachinesInnerBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

