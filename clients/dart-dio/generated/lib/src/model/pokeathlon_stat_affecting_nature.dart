//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nature_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokeathlon_stat_affecting_nature.g.dart';

/// PokeathlonStatAffectingNature
///
/// Properties:
/// * [maxChange] - The maximum amount of change to the referenced Pokéathlon stat.
/// * [nature] - The nature causing the change.
@BuiltValue()
abstract class PokeathlonStatAffectingNature implements Built<PokeathlonStatAffectingNature, PokeathlonStatAffectingNatureBuilder> {
  /// The maximum amount of change to the referenced Pokéathlon stat.
  @BuiltValueField(wireName: r'max_change')
  int get maxChange;

  /// The nature causing the change.
  @BuiltValueField(wireName: r'nature')
  NatureSummary get nature;

  PokeathlonStatAffectingNature._();

  factory PokeathlonStatAffectingNature([void updates(PokeathlonStatAffectingNatureBuilder b)]) = _$PokeathlonStatAffectingNature;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokeathlonStatAffectingNatureBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokeathlonStatAffectingNature> get serializer => _$PokeathlonStatAffectingNatureSerializer();
}

class _$PokeathlonStatAffectingNatureSerializer implements PrimitiveSerializer<PokeathlonStatAffectingNature> {
  @override
  final Iterable<Type> types = const [PokeathlonStatAffectingNature, _$PokeathlonStatAffectingNature];

  @override
  final String wireName = r'PokeathlonStatAffectingNature';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokeathlonStatAffectingNature object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'max_change';
    yield serializers.serialize(
      object.maxChange,
      specifiedType: const FullType(int),
    );
    yield r'nature';
    yield serializers.serialize(
      object.nature,
      specifiedType: const FullType(NatureSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokeathlonStatAffectingNature object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokeathlonStatAffectingNatureBuilder result,
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
        case r'nature':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(NatureSummary),
          ) as NatureSummary;
          result.nature.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokeathlonStatAffectingNature deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokeathlonStatAffectingNatureBuilder();
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


