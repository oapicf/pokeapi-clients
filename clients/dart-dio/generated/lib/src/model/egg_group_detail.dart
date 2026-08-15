//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/egg_group_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/egg_group_detail_pokemon_species_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'egg_group_detail.g.dart';

/// EggGroupDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [names] 
/// * [pokemonSpecies] 
@BuiltValue()
abstract class EggGroupDetail implements Built<EggGroupDetail, EggGroupDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'names')
  BuiltList<EggGroupName> get names;

  @BuiltValueField(wireName: r'pokemon_species')
  BuiltList<EggGroupDetailPokemonSpeciesInner> get pokemonSpecies;

  EggGroupDetail._();

  factory EggGroupDetail([void updates(EggGroupDetailBuilder b)]) = _$EggGroupDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EggGroupDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EggGroupDetail> get serializer => _$EggGroupDetailSerializer();
}

class _$EggGroupDetailSerializer implements PrimitiveSerializer<EggGroupDetail> {
  @override
  final Iterable<Type> types = const [EggGroupDetail, _$EggGroupDetail];

  @override
  final String wireName = r'EggGroupDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EggGroupDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(EggGroupName)]),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(BuiltList, [FullType(EggGroupDetailPokemonSpeciesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EggGroupDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EggGroupDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EggGroupName)]),
          ) as BuiltList<EggGroupName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EggGroupDetailPokemonSpeciesInner)]),
          ) as BuiltList<EggGroupDetailPokemonSpeciesInner>;
          result.pokemonSpecies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EggGroupDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EggGroupDetailBuilder();
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

