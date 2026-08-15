//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail_held_by_pokemon_inner_version_details_inner.g.dart';

/// ItemDetailHeldByPokemonInnerVersionDetailsInner
///
/// Properties:
/// * [rarity] 
/// * [version] 
@BuiltValue()
abstract class ItemDetailHeldByPokemonInnerVersionDetailsInner implements Built<ItemDetailHeldByPokemonInnerVersionDetailsInner, ItemDetailHeldByPokemonInnerVersionDetailsInnerBuilder> {
  @BuiltValueField(wireName: r'rarity')
  int get rarity;

  @BuiltValueField(wireName: r'version')
  AbilityDetailPokemonInnerPokemon get version;

  ItemDetailHeldByPokemonInnerVersionDetailsInner._();

  factory ItemDetailHeldByPokemonInnerVersionDetailsInner([void updates(ItemDetailHeldByPokemonInnerVersionDetailsInnerBuilder b)]) = _$ItemDetailHeldByPokemonInnerVersionDetailsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDetailHeldByPokemonInnerVersionDetailsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDetailHeldByPokemonInnerVersionDetailsInner> get serializer => _$ItemDetailHeldByPokemonInnerVersionDetailsInnerSerializer();
}

class _$ItemDetailHeldByPokemonInnerVersionDetailsInnerSerializer implements PrimitiveSerializer<ItemDetailHeldByPokemonInnerVersionDetailsInner> {
  @override
  final Iterable<Type> types = const [ItemDetailHeldByPokemonInnerVersionDetailsInner, _$ItemDetailHeldByPokemonInnerVersionDetailsInner];

  @override
  final String wireName = r'ItemDetailHeldByPokemonInnerVersionDetailsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDetailHeldByPokemonInnerVersionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'rarity';
    yield serializers.serialize(
      object.rarity,
      specifiedType: const FullType(int),
    );
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemDetailHeldByPokemonInnerVersionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDetailHeldByPokemonInnerVersionDetailsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'rarity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.rarity = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.version.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemDetailHeldByPokemonInnerVersionDetailsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDetailHeldByPokemonInnerVersionDetailsInnerBuilder();
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

