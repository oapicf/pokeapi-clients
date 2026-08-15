//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nature_detail_pokeathlon_stat_changes_inner.g.dart';

/// NatureDetailPokeathlonStatChangesInner
///
/// Properties:
/// * [maxChange] 
/// * [pokeathlonStat] 
@BuiltValue()
abstract class NatureDetailPokeathlonStatChangesInner implements Built<NatureDetailPokeathlonStatChangesInner, NatureDetailPokeathlonStatChangesInnerBuilder> {
  @BuiltValueField(wireName: r'max_change')
  int get maxChange;

  @BuiltValueField(wireName: r'pokeathlon_stat')
  AbilityDetailPokemonInnerPokemon get pokeathlonStat;

  NatureDetailPokeathlonStatChangesInner._();

  factory NatureDetailPokeathlonStatChangesInner([void updates(NatureDetailPokeathlonStatChangesInnerBuilder b)]) = _$NatureDetailPokeathlonStatChangesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NatureDetailPokeathlonStatChangesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NatureDetailPokeathlonStatChangesInner> get serializer => _$NatureDetailPokeathlonStatChangesInnerSerializer();
}

class _$NatureDetailPokeathlonStatChangesInnerSerializer implements PrimitiveSerializer<NatureDetailPokeathlonStatChangesInner> {
  @override
  final Iterable<Type> types = const [NatureDetailPokeathlonStatChangesInner, _$NatureDetailPokeathlonStatChangesInner];

  @override
  final String wireName = r'NatureDetailPokeathlonStatChangesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NatureDetailPokeathlonStatChangesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'max_change';
    yield serializers.serialize(
      object.maxChange,
      specifiedType: const FullType(int),
    );
    yield r'pokeathlon_stat';
    yield serializers.serialize(
      object.pokeathlonStat,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    NatureDetailPokeathlonStatChangesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NatureDetailPokeathlonStatChangesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max_change':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChange = valueDes;
          break;
        case r'pokeathlon_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokeathlonStat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  NatureDetailPokeathlonStatChangesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NatureDetailPokeathlonStatChangesInnerBuilder();
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

